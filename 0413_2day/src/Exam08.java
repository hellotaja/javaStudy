import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}

	}

}
