import java.util.Scanner;

public class Exam06_2 {

	public static void main(String[] args) {
		// ���̾�Ʈ ���� ���α׷� ���� �����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ >> ");
		int now = sc.nextInt();
		int goal;
		
		while(true) {
			System.out.print("��ǥ ������ >> ");
			goal = sc.nextInt();
			
			if(goal > now) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			}else {
				break;
			}

		}
		int week = 0;
		
		while(true) {
			week++;
			System.out.print(week + " ���� ���� ������ >> ");
			int down = sc.nextInt();
			now -= down;
			
			if(goal >= now) {
				System.out.println(now + "kg �޼�!! �����մϴ�!");
				break;
			}
		}

	}

}
