package teamvs;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();
		if((num % 10) < 6) {
			System.out.println("�ݿø� �� : " + (num - (num % 10)));
			
		}else {
			System.out.println("�ݿø� �� : " + (num + (10-(num % 10))));
		}
	}

}
