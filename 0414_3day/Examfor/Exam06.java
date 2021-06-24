package Examfor;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + " ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 구하고 싶은 숫자는 ? >> ");
		int num = sc.nextInt();
		
		for(int j = 1; j <= num; j++) {
			if(num % j == 0) {
				System.out.print(j + " ");
			}
		}
		
		// 다중 for문으로 약수구하기
		for(int n = 1; n < 30; n++) {
			System.out.print(n + "의 약수 : ");
			for(int m = 1; m <= n; m++) {
				if(n % m == 0) {
					System.out.print(m + " ");
				}
			}System.out.println();
		}
		
		

	}

}
