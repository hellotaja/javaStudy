import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// �󱸰� ���ڰ��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int balls = sc.nextInt();
		System.out.print("�ʿ��� ������ �� : ");
		System.out.println(balls % 5 == 0 ? balls / 5 : (balls / 5) + 1);
		
		// ���� �ӽñ� ���߱�
		System.out.print("����� ���̴�? : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.print("�����Դϴ�.");
		}
	}

}
