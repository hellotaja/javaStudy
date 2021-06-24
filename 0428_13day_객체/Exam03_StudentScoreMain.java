import java.util.Scanner;

public class Exam03_StudentScoreMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentScore[] score_arr =  new StudentScore[3];
		
		
		for(int i = 0; i < score_arr.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요. >> ");
			String name = sc.next();
			
			System.out.print((i+1) + "번째 학생의 Java점수를 입력하세요. >> " );
			int java = sc.nextInt();
			
			System.out.print((i+1) + "번째 학생의 Web점수를 입력하세요. >> " );
			int web = sc.nextInt();
			
			System.out.print((i+1) + "번째 학생의 Android점수를 입력하세요. >> " );
			int and = sc.nextInt();
			
			System.out.println();
		
			// 학생 객체 생성
			score_arr[i] = new StudentScore(name, java, web, and);
		}	

		for(StudentScore score : score_arr) {
			int total_score = score.getScoreJava()+score.getScoreWeb()+score.getScoreWeb();
			System.out.printf("%s학생의 총점은 %d점, 평균은 %d점입니다.", score.getName(), total_score, total_score/3);
			System.out.println();
			
		}
	}

}
