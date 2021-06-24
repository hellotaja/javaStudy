import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayList_3 {

	public static void main(String[] args) {
		// 노래조회 기능을 메서드로 만들기
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>(); // 노래를 담아줄 arraylist
		
		while(true) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래조회 [4]종료 >> ");
			int num = sc.nextInt();
			if(num == 1) {
				viewPlayList(arr);
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int inputNum = sc.nextInt();
				System.out.print("추가할 노래 제목 입력 >> ");
				String input = sc.next();
				if(inputNum == 1) {
					arr.add(input);
				}else {
					System.out.print("몇번째 자리에 입력하시겠습니까? >> ");
					int n = sc.nextInt();
					arr.add(n - 1, input);
				}System.out.println("추가가 완료되었습니다!");
				System.out.println();
			}else if(num == 2) {
				System.out.print("[1]전체삭제 [2]한곡삭제 >> ");
				int inputNum = sc.nextInt();
				if(inputNum == 1) {
					arr.removeAll(arr);
					System.out.println("삭제가 완료되었습니다.");
					System.out.println();
				}else {
					viewPlayList(arr);
					System.out.print("몇번째 노래를 삭제하시겠습니까? >> ");
					int n = sc.nextInt();
					arr.remove(n-1);
					System.out.println("삭제가 완료되었습니다.");
					System.out.println();
				}
			}else if(num == 3) {
				viewPlayList(arr);
				System.out.println();
			}else if(num == 4) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}


	public static void viewPlayList(ArrayList<String> arr) {
		System.out.println("==============현재 재생 목록==============");
		if (arr.size() == 0) {
			System.out.println("재생 목록이 없습니다..");
		} else {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println((i + 1) + ". " + arr.get(i));
			}
		}
		System.out.println("======================================");
	}
}
