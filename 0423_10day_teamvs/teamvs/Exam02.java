package teamvs;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 >> ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 >> ");
		int goal = sc.nextInt();
		
		int i = 1;
		while(now >= goal) {
			System.out.print(i + "주차 감량 몸무게 >> ");
			int num = sc.nextInt();
			now = now - num;
			i++;
		}
		if(now <= goal) {
			System.out.println(now + "kg 달성! 축하합니다!");
		}
	}

}
