
public class Exam05 {

	public static void main(String[] args) {
		// 소수여부 논리반환 메소드
		System.out.println(isPrimeNum(7));

	}
	
	public static boolean isPrimeNum(int num) {
		int n = 0;
		for(int i= 1; i < num; i++) {
			if(num % i == 0) {
				n = i;
			}
		}return n == 1;
	}
}
