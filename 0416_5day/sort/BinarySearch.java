package sort;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// ����Ž�� (updown����)
		// ����Ž���� �⺻���������� ������ �Ǿ��ִٴ� �����Ͽ� �����.
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.print("�ε����� ã�� ���� ���ڴ�? ");
		int iKey = sc.nextInt();
		
		int mid;
		int left = 0;
		int right = arr.length -1;
		
		while(right >= left) {
			mid = (right + left) / 2;
			
			if(iKey == arr[mid]) {
				System.out.println(iKey + "�� " + mid + "��°�� �ֽ��ϴ�.");
				break;
			}else if(iKey < arr[mid]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}

	}

}
