
public class Exam02 {

	public static void main(String[] args) {
		// ��� Ȯ�� �޼ҵ� (num2 �� num1�� ����ΰ���?)
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		
		System.out.println(isDivisor(9, 2));

	}
	public static boolean isDivisor(int num1, int num2) {
		return num1 % num2 == 0;
	}

}
