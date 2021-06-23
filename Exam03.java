import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		// switch문 시작
		int num = 9;
		
		switch(num) {
		case 10 : 
			System.out.println("10입니다 !");
			break;
		case 9 :
			System.out.println("9입니다 !");
			break;
		case 8 :
			System.out.println("8입니다 !");
			break;
		case 7 :
			System.out.println("7입니다 !");
			break;
		default :
			System.out.println("10도 9도 8도 7도 아닙니다.");
			break;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 >> ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12, 1, 2 :
			System.out.println(month + "월은 겨울 입니다!");
			break;
		case 3, 4, 5 :
			System.out.println(month + "월은 봄 입니다!");
			break;
		case 6, 7, 8 :
			System.out.println(month + "월은 여름 입니다!");
			break;
		case 10, 11 :
			System.out.println(month + "월은 가을 입니다!");
			break;
		}
		
		System.out.print("점수 입력 >> ");
		int totalScore = sc.nextInt();
		
		switch(totalScore / 10) {
		case 9 :
			System.out.println("A학점 입니다!");
			break;
		case 8 :
			System.out.println("B학점 입니다!");
			break;
		case 7 :
			System.out.println("C학점 입니다!");
			break;
		default :
			System.out.println("D학점 입니다!");
			break;
		
		
		}
	}

}
