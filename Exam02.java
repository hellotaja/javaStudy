import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ��� >> ");
		int kpi = sc.nextInt();
		
		int bonus;
		
		if(kpi >= 300) {
			bonus = 50;
		}else if(kpi >= 200) {
			bonus = 30;
		}else if(kpi >= 100) {
			bonus = 20;
		}else {
			bonus = 0;
		}
		
		int pay = kpi + bonus; // Ȥ�� ���ڿ����� �Ұ�ȣ()�� ���μ� ���� ����ϴ� ����� ����
		System.out.println("�� �޿��� " + pay + "���� �Դϴ�.");
	}

}
