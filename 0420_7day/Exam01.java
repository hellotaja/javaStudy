
public class Exam01 {

	public static void main(String[] args) {
		// 2개의 정수 base, n을 받아 base의 n 제곱하는 함수 만들기
		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);
	}
	
	public static int powerN(int base, int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * base;
		}
		return result;
	}

}
