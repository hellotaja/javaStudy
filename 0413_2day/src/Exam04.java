import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// ���� ����� ctrl + d
		
		int i = 3;
		int j = 10;
		System.out.println(i == j ? "����" : "�ٸ���");
		
		// ū ������ ������ ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�� ���� �� : ");
		System.out.print(num1 > num2 ? num1 - num2 : num2 - num1 );
		

	}

}
