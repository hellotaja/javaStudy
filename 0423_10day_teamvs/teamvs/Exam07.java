package teamvs;

public class Exam07 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		for(int i = 1; i < 78; i++) {
			num2 = i;
			num1 = 78 - i;
			sum += num1 * num2;
		}
		System.out.println(sum);
	}

}
