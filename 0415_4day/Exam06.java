import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// ���̾�Ʈ ���� ���α׷� (��ǥ ������ �޼����� ��� �ݺ����� ���)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ >> ");
		int now = sc.nextInt();
		System.out.print("��ǥ ������ >> ");
		int goal = sc.nextInt();
		int week = 0;
		
		while(true) {
			week++;
			System.out.print(week + "���� ���� ������ >> ");
			int down = sc.nextInt();
			now -= down;
			
			if(now < goal) {
				System.out.println(now + " �޼� ���ϵ帳�ϴ�~!");
				break;
			}
		}

	}

}
