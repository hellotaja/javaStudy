import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// Scanner Ŭ����
		Scanner sc = new Scanner(System.in);

		// while������ 0�� �ԷµǸ� ������ �ݺ����� ������

		int num = 0; // ����

		while (true) {
			System.out.print("���� �Է� >>> ");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}

		// Ű����κ��� �Է¹��� ���� 10���� Ŭ�� ����
		int input2 = 0;
		while(input2 < 11) {
			System.out.print("���� �Է� >> ");
			input2 = sc.nextInt();
		}System.out.println("����Ǿ����ϴ�.");
	}

}
