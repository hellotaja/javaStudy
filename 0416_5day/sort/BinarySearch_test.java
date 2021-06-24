package sort;

import java.util.Scanner;

public class BinarySearch_test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.print("�ε����� ã�� ���� ���ڴ� ? ");
		int iKey = sc.nextInt();
		
		int mid;
		int left = 0;
		int right = arr.length -1;
		
		while(right >= left) {
			mid = (left + right) / 2;
					
			if(iKey == arr[mid]) {
				System.out.println(iKey + "�� " + mid + "��°�� �ֽ��ϴ�.");
				break;
			}else if(iKey > arr[mid]) {
				left = mid + 1;
			}else {
				right = mid -1;
			}
		}

	}

}
