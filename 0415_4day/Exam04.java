import java.util.Random;

public class Exam04 {

	public static void main(String[] args) {
		// Random Ŭ����
		// ������ ���� �޾ƿ���
		Random random = new Random();
		// random.nextInt(����); > ���� ����(0�̻� ���� �̸�)
		// 1~ 20������ ������ ���� ���� ����
		int num = random.nextInt(20) + 1;
		System.out.println(num);
	}

}
