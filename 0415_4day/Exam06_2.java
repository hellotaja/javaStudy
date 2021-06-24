import java.util.Scanner;

public class Exam06_2 {

	public static void main(String[] args) {
		// 다이어트 관리 프로그램 새로 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 >> ");
		int now = sc.nextInt();
		int goal;
		
		while(true) {
			System.out.print("목표 몸무게 >> ");
			goal = sc.nextInt();
			
			if(goal > now) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}else {
				break;
			}

		}
		int week = 0;
		
		while(true) {
			week++;
			System.out.print(week + " 주차 감량 몸무게 >> ");
			int down = sc.nextInt();
			now -= down;
			
			if(goal >= now) {
				System.out.println(now + "kg 달성!! 축하합니다!");
				break;
			}
		}

	}

}
