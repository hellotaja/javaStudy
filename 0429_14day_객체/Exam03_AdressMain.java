import java.util.ArrayList;
import java.util.Scanner;

public class Exam03_AdressMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Address> arr = new ArrayList<Address>();
		
		while(true) {
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String phone = sc.next();
				
				System.out.println();
				arr.add(new Address(name, age, phone));
				
			}else if(num == 2) {
				if(arr.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
					System.out.println();
				}else {
					int index = 1;
					for(Address a : arr) {
						System.out.printf("%d. %s(%d��) : %s%n", index, a.getName(), a.getAge(), a.getPhoneNumber());
						index++;
					}System.out.println();
				}
			}else if(num == 3) {
				if(arr.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
					System.out.println();
				}else {
					for(Address a : arr) {
						int index = 1;
						System.out.printf("%d. %s(%d��) : %s%n", index, a.getName(), a.getAge(), a.getPhoneNumber());
						index++;
					}System.out.println();
					System.out.print("������ ��ȣ �Է� : ");
					int remove = sc.nextInt();
					arr.remove(remove - 1);
					System.out.println(remove + "�� ����� �����Ǿ����ϴ�.");
					System.out.println();
				}
			}else if(num == 4) {
				if(arr.size() == 0) {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
					System.out.println();
				}else {
					System.out.print("�˻��� �̸� �Է� : ");
					String search = sc.next();
					
					for(int i = 0; i < arr.size(); i++) {
						if(search.equals(arr.get(i).getName())) {
							System.out.printf("%d. %s(%d��) : %s", (i+1), arr.get(i).getName(), arr.get(i).getAge(), arr.get(i).getPhoneNumber());
							System.out.println("\n");
							break;
						}
						if(i == arr.size()-1) {
							System.out.println("�˻��� �̸��� ������ �����ϴ�.");
							System.out.println();
						}
					}
				}
			}else if(num == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
		

	}

}
