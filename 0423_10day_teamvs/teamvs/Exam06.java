package teamvs;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 >> ");
		int num2 = sc.nextInt();
		
		int ans1 = 0;
		int ans2 = 0;
		
		
		if (num1 > num2) {
			for(int i = 1; i <= num1; i++) {
				if(num1 % i == 0 & num2 % i ==0) {
					ans1 = i;
				}
			}
		}else {
			for(int i = 1; i <= num2; i++) {
				if(num1 % i == 0 & num2 % i ==0) {
					ans1 = i;
				}
			}
		}
		
		ans2 = ans1*(num1/ans1)*(num2/ans1);
		
		System.out.println("최대 공약수 : " + ans1);
		System.out.println("최대 공배수 : " + ans2);
	}
}
