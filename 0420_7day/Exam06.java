
public class Exam06 {

	public static void main(String[] args) {
		// 피보나치 수열 구하기
		// 피보나치 수열 1 1 2 3 5 8 ... 
		System.out.println(getPibo(1));
		System.out.println(getPibo(2));
		System.out.println(getPibo(3));
		System.out.println(getPibo(4));
		System.out.println(getPibo(5));
		
		
	}
	public static int getPibo(int num) {
		int beforeNum1 = 1;
		int beforeNum2 = 1;
		int pibo = 0;
		if(num == 1) {
			return 1;
		}else if(num == 2) {
			return 1;
		}else {
			for(int i = 3; i <= num; i++) {
				pibo = beforeNum1 + beforeNum2;
				beforeNum1 = beforeNum2;
				beforeNum2 = pibo;
			}
			return pibo;
		}
	}	
}
