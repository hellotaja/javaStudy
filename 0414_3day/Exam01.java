import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 >> ");
		int grade = sc.nextInt();
		if(grade >= 90) {
			String score = "A"; // score 변수는 지역변수 (if문 안에서만 살아있는 변수) 
		}else if(grade >= 80) { // -> if문 밖에 비어있는 score를 저장하여 전역변수로!
			String score = "B";
		}else if(grade >= 70) {
			String score = "C";
		}
		System.out.println(score);
		
		
		
		

	}

}
