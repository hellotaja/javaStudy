import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// ���ھ߱� �����

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// 1 ~ 20���� ������ ������ 3�� ���� �������� (�ߺ� �Ұ�) ����������!
		int random_num1 = 0, random_num2 = 0, random_num3 = 0;
		int s = 0, b = 0;

		while (true) {
			random_num1 = new Random().nextInt(20) + 1;
			random_num2 = new Random().nextInt(20) + 1;
			random_num3 = new Random().nextInt(20) + 1;

			if (random_num1 != random_num2 & random_num2 != random_num3 & random_num3 != random_num1) {
				break;
			}
		}
		int[] arr = { random_num1, random_num2, random_num3 };

		while (true) {
			s = 0; 
			b = 0;
			// ����ڷκ��� ���� �ޱ�\
			System.out.print("ù��° �� >> ");
			int ans1 = sc.nextInt();
			System.out.print("�ι�° �� >> ");
			int ans2 = sc.nextInt();
			System.out.print("����° �� >> ");
			int ans3 = sc.nextInt();

			int[] ans = { ans1, ans2, ans3 };

			// ��Ʈ����ũ, �� ī��Ʈ
			for (int i = 0; i < 3; i++) {
				if (ans[i] == arr[i]) {
					s += 1;
					b -= 1;
				}
				for (int j = 0; j < 3; j++) {
					if (ans[i] == arr[j]) {
						b += 1;
					}
				}
			}
			if (s == 3) {
				System.out.println("��Ʈ����ũ! ������������");
				break;
			}System.out.println(s + "s, " + b + "b");
		}


	}

}
