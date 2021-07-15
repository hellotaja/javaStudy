import java.util.ArrayList;
import java.util.Scanner;

public class Exam04_StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> info = new ArrayList<Student>();
		
		System.out.println("=========================���� ���� ���α׷�=========================");
		
		while(true) {
			System.out.print("[1]�����Է� [2]��ü��ȸ [3]�л��˻� [4]���α׷� ���� >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("�й� : ");
				String num = sc.next();
				System.out.print("Java���� : ");
				int java = sc.nextInt();
				System.out.print("Web���� : ");
				int web = sc.nextInt();
				System.out.print("Android���� : ");
				int and = sc.nextInt();
				System.out.println();
				
				info.add(new Student(name, num, java, web, and));
				
			}else if(menu == 2) {
				System.out.println("============================��ü��ȸ============================");
				if(info.size() == 0) {
					System.out.println("��ȸ �� �����Ͱ� �����ϴ�.");
					System.out.println();
				}else {
					System.out.printf("�̸�\t�й�\tJava\tAndroid\tWeb%n");
					for(Student stu : info) {
						System.out.printf("%s\t%s\t%d\t%d\t%d%n", stu.getName(), stu.getNumber(), stu.getScoreJava(), stu.getScoreAndroid(), stu.getScoreAndroid());
					}System.out.println();
				}
			}else if(menu == 3) {
				System.out.print("�˻��� �̸� �Է� : ");
				String search = sc.next();
				System.out.println("============================��ü��ȸ============================");
				if(info.size() == 0) {
					System.out.println("��ȸ �� �����Ͱ� �����ϴ�.");
					System.out.println();
				}else {
					for(int i = 0; i < info.size(); i++) {
						if(search == info.get(i).getName()) {
							System.out.printf("%s\t%s\t%d\t%d\t%d%n", info.get(i).getName(), info.get(i).getNumber(), info.get(i).getScoreJava(), info.get(i).getScoreAndroid(), info.get(i).getScoreAndroid());
							break;
						}
						if(i == info.size() - 1) {
							System.out.println("�˻��� �̸��� ������ �����ϴ�.");
							System.out.println();
						}
					}
				}

				
			}else if(menu == 4) {
				System.out.println("���� ���� ���α׷��� �����մϴ�.");
				break;
			}
			
		}
		

	}

}
