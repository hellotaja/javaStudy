
public class Exam04 {

	public static void main(String[] args) {
		// 매개변수가 완전수인지 아닌지 논리값 반환하는 메소드
		System.out.println(isPerfect(7));
		System.out.println(isPerfect(6));

	}
	public static boolean isPerfect(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
}
