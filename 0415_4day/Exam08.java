import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 로그인 프로그램
		String ID = "smhrd";
		String password = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();

			System.out.print("비밀번호 : ");
			String pw = sc.next();
					
			if(id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("아이디 비밀번호를 다시 확인하세요.");
			}
		}

	}

}
