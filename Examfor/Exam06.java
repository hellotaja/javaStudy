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
		System.out.print("����� ���ϰ� ���� ���ڴ� ? >> ");
		int num = sc.nextInt();
		
		for(int j = 1; j <= num; j++) {
			if(num % j == 0) {
				System.out.print(j + " ");
			}
		}
		
		// ���� for������ ������ϱ�
		for(int n = 1; n < 30; n++) {
			System.out.print(n + "�� ��� : ");
			for(int m = 1; m <= n; m++) {
				if(n % m == 0) {
					System.out.print(m + " ");
				}
			}System.out.println();
		}
		
		

	}

}
