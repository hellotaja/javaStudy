
public class Exam03 {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 5;
		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);

		System.out.println(close10(2, 7));
		System.out.println(close10(-5, -1));
		System.out.println(close10(13, 2));
		System.out.println(close10(8, 12));

	}

	
	public static int close10(int num1, int num2) {
		// 2�� �����߿� 10�� �� ����� ���� ��ȯ�ϴ� �޼ҵ�
		if((10 - num1) + (10 - num2) == 0) {
			return 0;
		}else if((10 - num1) < (10 - num2)) {
			return num1;
		}else {
			return num2;
		}

	}
}
