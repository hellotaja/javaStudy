import java.util.Scanner;

public class Exam08_2 {

	public static void main(String[] args) {
		// 로그인 프로그램 다시풀기!
		String ID = "권누리";
		String password = "0727";
				
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 입력 >> ");
			String login_ID = sc.next();
			System.out.print("비밀번호 입력 >> ");
			String login_password = sc.next();
		
			if(ID.equals(login_ID) && password.equals(login_password)) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("아이디, 비밀번호를 다시 확인하세요.");
			}
		}
		

	}

}
