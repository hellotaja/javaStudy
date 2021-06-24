import java.util.Random;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 업다운 게임
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(20) + 1;
		int num = 0;
		
		while(num != answer) {
			System.out.print("number >> ");
			num = sc.nextInt();
			
			if(answer > num) {
				System.out.println("up");
			}
			else if(answer < num) {
				System.out.println("down");
			}
		}System.out.println("Success!");
	}
}
