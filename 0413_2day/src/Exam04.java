import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// 한줄 지우기 ctrl + d
		
		int i = 3;
		int j = 10;
		System.out.println(i == j ? "같다" : "다르다");
		
		// 큰 수에서 작은수 빼기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("두 수의 차 : ");
		System.out.print(num1 > num2 ? num1 - num2 : num2 - num1 );
		

	}

}
