import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// Ű����� �� �Է¹ޱ�
		int num1 = 10;
		
		// ����ڷκ��� �� �Է¹ޱ� (input)
		// Java Scanner class
		// 1. Scanner class �ҷ�����
		Scanner sc = new Scanner(System.in); 
		// import ���� ������ ���� ��, ������ �κ��� ������ �����ذ� ���� (java.utill ����)
		// import ����Ű ctrl shift 'o'
		
		// �Է��� ���� �ȳ�����
		System.out.print("���� �Է� : ");
		// ���� �Է¹޴� �ڵ�
		int number = sc.nextInt();
		System.out.println("�Է��� ���� : " + number);
		
		
		// ��������� ����
		System.out.print("ù��° �����Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�ι�° �����Է� : ");
		int num3 = sc.nextInt();
		System.out.println("�� ���� ���ϱ� : " + (num2 + num3));
		System.out.println("�� ���� ���� : " + (num2 - num3));
		System.out.println("�� ���� ���ϱ� : " + (num2 * num3));
		System.out.println("�� ���� ������(��) : " + (num2 / num3));
		
		// ���� �Ʒ��������� ���� ctrl alt �Ʒ�����
		
	}

}
