import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// Scanner 클래스
		Scanner sc = new Scanner(System.in);

		// while문으로 0이 입력되면 끝나는 반복문을 만들어보자

		int num = 0; // 정답

		while (true) {
			System.out.print("정수 입력 >>> ");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

		// 키보드로부터 입력받은 수가 10보다 클때 종료
		int input2 = 0;
		while(input2 < 11) {
			System.out.print("정수 입력 >> ");
			input2 = sc.nextInt();
		}System.out.println("종료되었습니다.");
	}

}
