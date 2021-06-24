
public class Exam06_2 {

	public static void main(String[] args) {
		// 쌤 답안
		// 피보나치 수열 1 1 2 3 5 8 ... 
		System.out.println(getPibo(1));
		System.out.println(getPibo(2));
		System.out.println(getPibo(3));
		System.out.println(getPibo(4));
		System.out.println(getPibo(5));
	}
	
	public static int getPibo(int num) {
		if (num == 1) {
			return 1;
		}else if(num == 2) {
			return 1;
		}else {// 메소드 안에서 메소드가 작동
			return getPibo(num - 2) + getPibo(num - 1);
		}
	}
}
