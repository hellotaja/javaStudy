
public class Exam02 {

	public static void main(String[] args) {
		// 실습문제
		int arr [] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.print("array에 들어있는 짝수는 ");
		for(int iseven = 2; iseven < 10; iseven++) {
			if(arr[iseven] % 2 == 0) {
				System.out.print(arr[iseven] + " ");
			}
		}System.out.println("입니다.");
		
		// 실습문제 2 (이번엔 홀수 입력)
		int cnt = 0;
		
		System.out.print("array에 들어있는 홀수는 ");
		for(int isodd = 1; isodd < 10; isodd++) {
			if(arr[isodd] % 2 != 0) {
				System.out.print(arr[isodd] + " ");
				cnt++;
			}
		}System.out.println("이며");
		System.out.println("총 " + cnt + "개 입니다");

	}

}
