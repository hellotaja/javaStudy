import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		int grade = sc.nextInt();
		if(grade >= 90) {
			String score = "A"; // score ������ �������� (if�� �ȿ����� ����ִ� ����) 
		}else if(grade >= 80) { // -> if�� �ۿ� ����ִ� score�� �����Ͽ� ����������!
			String score = "B";
		}else if(grade >= 70) {
			String score = "C";
		}
		System.out.println(score);
		
		
		
		

	}

}
