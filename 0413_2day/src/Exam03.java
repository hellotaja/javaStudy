import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// ��������� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int totalSecond = sc.nextInt();
		
		System.out.println("�ð� : " + totalSecond / 3600);
		System.out.println("�� : " + (totalSecond % 3600)/60);
		System.out.println("�� : " + (totalSecond % 60));
		
		// ���������� ����
		int hap = 0, j = 0, k = 0, L = 0;
		hap = ++j + k++ + ++L;
		System.out.println(hap + "," + j + "," + k + "," + L);
		
		
	}
}
