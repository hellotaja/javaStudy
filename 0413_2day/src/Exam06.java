import java.util.Scanner;
public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 숫자는 ? ");
		int num = sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.print("3과 5의 배수입니다.");
			
		}

	}

}
