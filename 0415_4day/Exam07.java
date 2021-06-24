import java.util.Random;
import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int chance = 5;
		
		while(chance > 0) {
			int a = ran.nextInt(9) + 1;
			int b = ran.nextInt(9) + 1;
			
			System.out.print(a + " + " + b + " = ");
			int answer = sc.nextInt();
			
			if(answer == a + b) {
				System.out.println("SUCCESS !");
			}else {
				System.out.println("Fail...");
				chance -= 1;
			}System.out.print("GAME OVER!");
					
		}

	}

}
