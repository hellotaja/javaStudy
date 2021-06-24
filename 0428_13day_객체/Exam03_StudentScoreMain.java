import java.util.Scanner;

public class Exam03_StudentScoreMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentScore[] score_arr =  new StudentScore[3];
		
		
		for(int i = 0; i < score_arr.length; i++) {
			System.out.print((i+1) + "��° �л��� �̸��� �Է��ϼ���. >> ");
			String name = sc.next();
			
			System.out.print((i+1) + "��° �л��� Java������ �Է��ϼ���. >> " );
			int java = sc.nextInt();
			
			System.out.print((i+1) + "��° �л��� Web������ �Է��ϼ���. >> " );
			int web = sc.nextInt();
			
			System.out.print((i+1) + "��° �л��� Android������ �Է��ϼ���. >> " );
			int and = sc.nextInt();
			
			System.out.println();
		
			// �л� ��ü ����
			score_arr[i] = new StudentScore(name, java, web, and);
		}	

		for(StudentScore score : score_arr) {
			int total_score = score.getScoreJava()+score.getScoreWeb()+score.getScoreWeb();
			System.out.printf("%s�л��� ������ %d��, ����� %d���Դϴ�.", score.getName(), total_score, total_score/3);
			System.out.println();
			
		}
	}

}
