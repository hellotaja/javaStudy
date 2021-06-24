import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList_3 {

	public static void main(String[] args) {
		// �뷡��ȸ ����� �޼���� �����
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>(); // �뷡�� ����� arraylist
		
		while(true) {
			System.out.print("[1]�뷡�߰� [2]�뷡���� [3]�뷡��ȸ [4]���� >> ");
			int num = sc.nextInt();
			if(num == 1) {
				viewPlayList(arr);
				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >> ");
				int inputNum = sc.nextInt();
				System.out.print("�߰��� �뷡 ���� �Է� >> ");
				String input = sc.next();
				if(inputNum == 1) {
					arr.add(input);
				}else {
					System.out.print("���° �ڸ��� �Է��Ͻðڽ��ϱ�? >> ");
					int n = sc.nextInt();
					arr.add(n - 1, input);
				}System.out.println("�߰��� �Ϸ�Ǿ����ϴ�!");
				System.out.println();
			}else if(num == 2) {
				System.out.print("[1]��ü���� [2]�Ѱ���� >> ");
				int inputNum = sc.nextInt();
				if(inputNum == 1) {
					arr.removeAll(arr);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					System.out.println();
				}else {
					viewPlayList(arr);
					System.out.print("���° �뷡�� �����Ͻðڽ��ϱ�? >> ");
					int n = sc.nextInt();
					arr.remove(n-1);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					System.out.println();
				}
			}else if(num == 3) {
				viewPlayList(arr);
				System.out.println();
			}else if(num == 4) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}


	public static void viewPlayList(ArrayList<String> arr) {
		System.out.println("==============���� ��� ���==============");
		if (arr.size() == 0) {
			System.out.println("��� ����� �����ϴ�..");
		} else {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println((i + 1) + ". " + arr.get(i));
			}
		}
		System.out.println("======================================");
	}
}
