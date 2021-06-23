package Examfor;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 >> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}

	}

}
