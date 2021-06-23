import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// 정보처리기사 합격여부
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB 점수입력 : ");
		int db = sc.nextInt();
		System.out.print("전자계산기 점수입력 : ");
		int cal = sc.nextInt();
		System.out.print("OS 점수입력 : ");
		int os = sc.nextInt();
		System.out.print("data 점수입력 : ");
		int data = sc.nextInt();
		System.out.print("SW 점수입력 : ");
		int sw = sc.nextInt();
		
		if((db + cal + os + data + sw) >= 60 && db >= 8 && cal >= 8 && os >= 8 && data >= 8 && sw >= 8) {
			System.out.println("합격입니다.");
		}else { 
			System.out.println("불합격입니다.");
		}

	}

}
