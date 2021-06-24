
public class Exam02 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 24;
		int result = LargeNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);
		
		System.out.println(LargeNumbers(2, 7));
		System.out.println(LargeNumbers(9, 5));
		System.out.println(LargeNumbers(8, 15));
		System.out.println(LargeNumbers(6, 6));
		

	}
	
	
	
	
	public static int LargeNumbers(int num1, int num2) {
		// 2개의 양수를 받아 더 큰 수 반환하는 메소드
		if(num1 > num2) {
			return num1;
		}else if(num2 > num1) {
			return num2;
		}else {
			return 0;
		}
	}
}
