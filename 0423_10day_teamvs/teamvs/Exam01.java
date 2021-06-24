package teamvs;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		if((num % 10) < 6) {
			System.out.println("반올림 수 : " + (num - (num % 10)));
			
		}else {
			System.out.println("반올림 수 : " + (num + (10-(num % 10))));
		}
	}

}
