
public class Exam03_2 {

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
		// ���밪 �Լ� ���
		
		int number1 = Math.abs(10 - num1);
		int number2 = Math.abs(10 - num2);
		
		if(number1 > number2) {
			return num2;
		}else if(number1 < number2) {
			return num1;
		}else {
			return 0;
		}
	}
	
}
