package Examfor;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// ������ ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� >> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}

	}

}
