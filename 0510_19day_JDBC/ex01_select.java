import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01_select {// 빈공간 더블클릭하면 클래스 내 전체선택

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String name = null;

		// 아이디와 비밀번호를 입력받아 해당 회원의 정보 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.next();

		System.out.print("비밀번호 : ");
		String pw = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 권한을 만들어줘야 정상적으로 접근가능
			// 경로 설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			//---------------------------------------------
			// 목적에 따라 달라져야 하는 부분
			String sql = "select * from member where id = ? and pw = ?";//id, pw, name, age 열
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id); // db는 index번호가 1부터 시작하기 때문에		
			psmt.setString(2, pw);
			
			// executeQuery : db에 있는 테이블에 값이 변하지 않을 때
			rs = psmt.executeQuery();
			// 이전에 썼던 executeUpdate는 db에 있는 값이 변할 때
			
			//----------------------------------------------
			if(rs.next()) {// 값이 존재하면 true, 없으면 false
				// 이름 출력하기
				name = rs.getString(3);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				psmt.close(); // 둘다 전역변수로 만들어줘야함
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			
			
		}
		if(name != null) {
			System.out.println(name+"님 환영합니다");
		}else {
			System.out.println("아이디와 비밀번호를 확인해주세요");
		}

	}

}
