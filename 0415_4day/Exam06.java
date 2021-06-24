import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 다이어트 관리 프로그램 (목표 몸무게 달성까지 계속 반복으로 물어봄)
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 >> ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 >> ");
		int goal = sc.nextInt();
		int week = 0;
		
		while(true) {
			week++;
			System.out.print(week + "주차 감량 몸무게 >> ");
			int down = sc.nextInt();
			now -= down;
			
			if(now < goal) {
				System.out.println(now + " 달성 축하드립니다~!");
				break;
			}
		}

	}

}
