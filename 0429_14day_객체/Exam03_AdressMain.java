import java.util.ArrayList;
import java.util.Scanner;

public class Exam03_AdressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Address> arr = new ArrayList<Address>();
		
		while(true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phone = sc.next();
				
				System.out.println();
				arr.add(new Address(name, age, phone));
				
			}else if(num == 2) {
				if(arr.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
					System.out.println();
				}else {
					int index = 1;
					for(Address a : arr) {
						System.out.printf("%d. %s(%d세) : %s%n", index, a.getName(), a.getAge(), a.getPhoneNumber());
						index++;
					}System.out.println();
				}
			}else if(num == 3) {
				if(arr.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
					System.out.println();
				}else {
					for(Address a : arr) {
						int index = 1;
						System.out.printf("%d. %s(%d세) : %s%n", index, a.getName(), a.getAge(), a.getPhoneNumber());
						index++;
					}System.out.println();
					System.out.print("삭제할 번호 입력 : ");
					int remove = sc.nextInt();
					arr.remove(remove - 1);
					System.out.println(remove + "번 목록이 삭제되었습니다.");
					System.out.println();
				}
			}else if(num == 4) {
				if(arr.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
					System.out.println();
				}else {
					System.out.print("검색할 이름 입력 : ");
					String search = sc.next();
					
					for(int i = 0; i < arr.size(); i++) {
						if(search.equals(arr.get(i).getName())) {
							System.out.printf("%d. %s(%d세) : %s", (i+1), arr.get(i).getName(), arr.get(i).getAge(), arr.get(i).getPhoneNumber());
							System.out.println("\n");
							break;
						}
						if(i == arr.size()-1) {
							System.out.println("검색한 이름의 정보가 없습니다.");
							System.out.println();
						}
					}
				}
			}else if(num == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		

	}

}
