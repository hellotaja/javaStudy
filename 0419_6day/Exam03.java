
public class Exam03 {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 5;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

		System.out.println(close10(2, 7));
		System.out.println(close10(-5, -1));
		System.out.println(close10(13, 2));
		System.out.println(close10(8, 12));

	}

	
	public static int close10(int num1, int num2) {
		// 2개 정수중에 10에 더 가까운 수를 반환하는 메소드
		if((10 - num1) + (10 - num2) == 0) {
			return 0;
		}else if((10 - num1) < (10 - num2)) {
			return num1;
		}else {
			return num2;
		}

	}
}
