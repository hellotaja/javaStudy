import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int workTime = sc.nextInt();
		
		if(workTime > 8) {
			float pay = workTime * 5000  + (workTime - 8) * 5000 * 1.5f;
			System.out.println("�� �ӱ��� " + pay + "�Դϴ�.");
		}else {
			float pay = workTime * 5000f;
			System.out.println("�� �ӱ��� " + pay + "�Դϴ�.");
		}
		
		

	}

}
