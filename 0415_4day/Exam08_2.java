import java.util.Scanner;

public class Exam08_2 {

	public static void main(String[] args) {
		// �α��� ���α׷� �ٽ�Ǯ��!
		String ID = "�Ǵ���";
		String password = "0727";
				
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���̵� �Է� >> ");
			String login_ID = sc.next();
			System.out.print("��й�ȣ �Է� >> ");
			String login_password = sc.next();
		
			if(ID.equals(login_ID) && password.equals(login_password)) {
				System.out.println("�α��� ����!");
				break;
			}else {
				System.out.println("���̵�, ��й�ȣ�� �ٽ� Ȯ���ϼ���.");
			}
		}
		

	}

}
