import java.util.ArrayList;
import java.util.Scanner;

public class Exam04_StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> info = new ArrayList<Student>();
		
		System.out.println("=========================학점 관리 프로그램=========================");
		
		while(true) {
			System.out.print("[1]성적입력 [2]전체조회 [3]학생검색 [4]프로그램 종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학번 : ");
				String num = sc.next();
				System.out.print("Java점수 : ");
				int java = sc.nextInt();
				System.out.print("Web점수 : ");
				int web = sc.nextInt();
				System.out.print("Android점수 : ");
				int and = sc.nextInt();
				System.out.println();
				
				info.add(new Student(name, num, java, web, and));
				
			}else if(menu == 2) {
				System.out.println("============================전체조회============================");
				if(info.size() == 0) {
					System.out.println("조회 할 데이터가 없습니다.");
					System.out.println();
				}else {
					System.out.printf("이름\t학번\tJava\tAndroid\tWeb%n");
					for(Student stu : info) {
						System.out.printf("%s\t%s\t%d\t%d\t%d%n", stu.getName(), stu.getNumber(), stu.getScoreJava(), stu.getScoreAndroid(), stu.getScoreAndroid());
					}System.out.println();
				}
			}else if(menu == 3) {
				System.out.print("검색할 이름 입력 : ");
				String search = sc.next();
				System.out.println("============================전체조회============================");
				if(info.size() == 0) {
					System.out.println("조회 할 데이터가 없습니다.");
					System.out.println();
				}else {
					for(int i = 0; i < info.size(); i++) {
						if(search == info.get(i).getName()) {
							System.out.printf("%s\t%s\t%d\t%d\t%d%n", info.get(i).getName(), info.get(i).getNumber(), info.get(i).getScoreJava(), info.get(i).getScoreAndroid(), info.get(i).getScoreAndroid());
							break;
						}
						if(i == info.size() - 1) {
							System.out.println("검색한 이름의 정보가 없습니다.");
							System.out.println();
						}
					}
				}

				
			}else if(menu == 4) {
				System.out.println("학점 관리 프로그램을 종료합니다.");
				break;
			}
			
		}
		

	}

}
