import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노동시간을 입력하세요 : ");
		int workTime = sc.nextInt();
		
		if(workTime > 8) {
			float pay = workTime * 5000  + (workTime - 8) * 5000 * 1.5f;
			System.out.println("총 임금은 " + pay + "입니다.");
		}else {
			float pay = workTime * 5000f;
			System.out.println("총 임금은 " + pay + "입니다.");
		}
		
		

	}

}
