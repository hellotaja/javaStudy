package teamvs;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ >> ");
		int now = sc.nextInt();
		System.out.print("��ǥ ������ >> ");
		int goal = sc.nextInt();
		
		int i = 1;
		while(now >= goal) {
			System.out.print(i + "���� ���� ������ >> ");
			int num = sc.nextInt();
			now = now - num;
			i++;
		}
		if(now <= goal) {
			System.out.println(now + "kg �޼�! �����մϴ�!");
		}
	}

}
