
public class Exam02_2 {

	public static void main(String[] args) {
		// ���׸��� ���� 4 ������ �� �ڡڡڡ� ������ ���� Ǯ���
		for(int line = 0; line < 5; line++) {// 5�� ���
			for(int blank = line; blank < 4; blank++) {
				System.out.print(" ");
			}
			for(int star = 0; star < 2 * line + 2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
