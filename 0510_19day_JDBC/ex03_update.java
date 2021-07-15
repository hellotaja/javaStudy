import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex03_update {
	// sql문 : update set pw = ' ' where id = ' '
	// -> 지정한 아이디의 패스워드를 바꾸겠다.
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;

		// 아이디를 입력받아서 비밀번호 수정
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
			String sql = "update member set pw = ? where id = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, pw);	
			psmt.setString(2, id);	
			
			int cnt = psmt.executeUpdate();
			// executeUpdate는 db에 있는 값이 변할 때
			
			if(cnt > 0) {
				System.out.println("수정성공");
			}else {
				System.out.println("수정실패");
			}
			//----------------------------------------------

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				psmt.close(); // 둘다 전역변수로 만들어줘야함
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 	
		}

	}






}
