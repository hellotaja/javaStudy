import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam01_insert {

	public static void main(String[] args) {
		// 아이디, 비밀번호, 이름, 나이를 입력받아서 DB에 저장시키기
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
//		// 하나의 계정 : id : smhrd , pw : 1234
//		if(id.equals("smhrd")) {
//			System.out.println("로그인에 성공했습니다");
//			System.out.println(id+"님 환영합니다 !");
//		// 이 방법은 많은 계정을 가지고 있을 때 오래걸릴 것임!
//		}
		
		// 자바와 JDBC를 연결하는 통로 만들기!
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 권한을 만들어줘야 정상적으로 접근가능
			// 경로 설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
					
			// 아이디
			String db_id = "hr";
			
			// 비밀번호
			String db_pw = "hr";
			
			// 여권 만들기
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			// 명령을 내릴 sql문 설정 (insert문 사용)
			// 불완전한 문장을 만들고 추후에 채워줌
			String sql = "insert into member values(?, ?, ?, ?)";//id, pw, name, age 열
			
				psmt = conn.prepareStatement(sql);
				
				psmt.setString(1, id); // db는 index번호가 1부터 시작하기 때문에
										// 첫번째 괄호 값에 id값을 집어넣겠다는 뜻.
				psmt.setString(2, pw);
				psmt.setString(3, name);
				psmt.setInt(4, age);
				// 말그대로 set까지 한것! (실행전)
				
				int cnt = psmt.executeUpdate(); //table에 변화가 있을때 사용 (한줄 늘어날때)
												// cnt : 늘어난 줄의 갯수
				if(cnt > 0) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("회원가입 실패");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // try/catch 를 사용하지 않을 경우 예외처리가 되어있지 않아서 에러 발생 
		finally {
			try {
				psmt.close(); // 둘다 전역변수로 만들어줘야함
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		
		

	}
}
