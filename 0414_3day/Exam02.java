import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실적액을 입력하세요 >> ");
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
		
		int pay = kpi + bonus; // 혹은 숫자연산을 소괄호()로 감싸서 먼저 계산하는 방법이 있음
		System.out.println("총 급여는 " + pay + "만원 입니다.");
	}

}
