import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 키보드로 값 입력받기
		int num1 = 10;
		
		// 사용자로부터 값 입력받기 (input)
		// Java Scanner class
		// 1. Scanner class 불러오기
		Scanner sc = new Scanner(System.in); 
		// import 없이 오류가 났을 때, 오류난 부분을 눌러서 문제해결 가능 (java.utill 선택)
		// import 단축키 ctrl shift 'o'
		
		// 입력을 위한 안내문구
		System.out.print("정수 입력 : ");
		// 값을 입력받는 코드
		int number = sc.nextInt();
		System.out.println("입력한 정수 : " + number);
		
		
		// 산술연산자 예제
		System.out.print("첫번째 정수입력 : ");
		int num2 = sc.nextInt();
		System.out.print("두번째 정수입력 : ");
		int num3 = sc.nextInt();
		System.out.println("두 수의 더하기 : " + (num2 + num3));
		System.out.println("두 수의 빼기 : " + (num2 - num3));
		System.out.println("두 수의 곱하기 : " + (num2 * num3));
		System.out.println("두 수의 나누기(몫) : " + (num2 / num3));
		
		// 한줄 아랫방향으로 복사 ctrl alt 아랫방향
		
	}

}
