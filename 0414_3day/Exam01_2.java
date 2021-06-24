import java.util.Scanner;

public class Exam01_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 >> ");
		int grade = sc.nextInt();
		
		String score = "";
		
		if(grade >= 90) {
			score = "A"; 
		}else if(grade >= 80) { 
			score = "B";
		}else if(grade >= 70) {
			score = "C";
		}
		System.out.println(score);

	}

}
