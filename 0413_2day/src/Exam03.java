import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 산술연산자 예제
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		
		System.out.println("시간 : " + totalSecond / 3600);
		System.out.println("분 : " + (totalSecond % 3600)/60);
		System.out.println("초 : " + (totalSecond % 60));
		
		// 증감연산자 예제
		int hap = 0, j = 0, k = 0, L = 0;
		hap = ++j + k++ + ++L;
		System.out.println(hap + "," + j + "," + k + "," + L);
		
		
	}
}
