import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		// switch�� ����
		int num = 9;
		
		switch(num) {
		case 10 : 
			System.out.println("10�Դϴ� !");
			break;
		case 9 :
			System.out.println("9�Դϴ� !");
			break;
		case 8 :
			System.out.println("8�Դϴ� !");
			break;
		case 7 :
			System.out.println("7�Դϴ� !");
			break;
		default :
			System.out.println("10�� 9�� 8�� 7�� �ƴմϴ�.");
			break;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� >> ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12, 1, 2 :
			System.out.println(month + "���� �ܿ� �Դϴ�!");
			break;
		case 3, 4, 5 :
			System.out.println(month + "���� �� �Դϴ�!");
			break;
		case 6, 7, 8 :
			System.out.println(month + "���� ���� �Դϴ�!");
			break;
		case 10, 11 :
			System.out.println(month + "���� ���� �Դϴ�!");
			break;
		}
		
		System.out.print("���� �Է� >> ");
		int totalScore = sc.nextInt();
		
		switch(totalScore / 10) {
		case 9 :
			System.out.println("A���� �Դϴ�!");
			break;
		case 8 :
			System.out.println("B���� �Դϴ�!");
			break;
		case 7 :
			System.out.println("C���� �Դϴ�!");
			break;
		default :
			System.out.println("D���� �Դϴ�!");
			break;
		
		
		}
	}

}
