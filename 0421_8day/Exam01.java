import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 숫자야구 만들기

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// 1 ~ 20까지 범위의 랜덤한 3개 숫자 가져오기 (중복 불가) 전역변수로!
		int random_num1 = 0, random_num2 = 0, random_num3 = 0;
		int s = 0, b = 0;

		while (true) {
			random_num1 = new Random().nextInt(20) + 1;
			random_num2 = new Random().nextInt(20) + 1;
			random_num3 = new Random().nextInt(20) + 1;

			if (random_num1 != random_num2 & random_num2 != random_num3 & random_num3 != random_num1) {
				break;
			}
		}
		int[] arr = { random_num1, random_num2, random_num3 };

		while (true) {
			s = 0; 
			b = 0;
			// 사용자로부터 숫자 받기\
			System.out.print("첫번째 수 >> ");
			int ans1 = sc.nextInt();
			System.out.print("두번째 수 >> ");
			int ans2 = sc.nextInt();
			System.out.print("세번째 수 >> ");
			int ans3 = sc.nextInt();

			int[] ans = { ans1, ans2, ans3 };

			// 스트라이크, 볼 카운트
			for (int i = 0; i < 3; i++) {
				if (ans[i] == arr[i]) {
					s += 1;
					b -= 1;
				}
				for (int j = 0; j < 3; j++) {
					if (ans[i] == arr[j]) {
						b += 1;
					}
				}
			}
			if (s == 3) {
				System.out.println("스트라이크! 예에에에에에");
				break;
			}System.out.println(s + "s, " + b + "b");
		}


	}

}
