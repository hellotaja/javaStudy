import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// ����ó����� �հݿ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB �����Է� : ");
		int db = sc.nextInt();
		System.out.print("���ڰ��� �����Է� : ");
		int cal = sc.nextInt();
		System.out.print("OS �����Է� : ");
		int os = sc.nextInt();
		System.out.print("data �����Է� : ");
		int data = sc.nextInt();
		System.out.print("SW �����Է� : ");
		int sw = sc.nextInt();
		
		if((db + cal + os + data + sw) >= 60 && db >= 8 && cal >= 8 && os >= 8 && data >= 8 && sw >= 8) {
			System.out.println("�հ��Դϴ�.");
		}else { 
			System.out.println("���հ��Դϴ�.");
		}

	}

}
