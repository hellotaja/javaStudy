package sort;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// 이진탐색 (updown게임)
		// 이진탐색의 기본전제조건은 정렬이 되어있다는 가정하에 진행됨.
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.print("인덱스를 찾고 싶은 숫자는? ");
		int iKey = sc.nextInt();
		
		int mid;
		int left = 0;
		int right = arr.length -1;
		
		while(right >= left) {
			mid = (right + left) / 2;
			
			if(iKey == arr[mid]) {
				System.out.println(iKey + "는 " + mid + "번째에 있습니다.");
				break;
			}else if(iKey < arr[mid]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}

	}

}
