import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 농구공 상자개수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int balls = sc.nextInt();
		System.out.print("필요한 상자의 수 : ");
		System.out.println(balls % 5 == 0 ? balls / 5 : (balls / 5) + 1);
		
		// 나이 머시기 맞추기
		System.out.print("당신의 나이는? : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.print("성인입니다.");
		}
	}

}
