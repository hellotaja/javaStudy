package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = new int[] {3, 6, 41, 2, 4, 1, 5, 70};
		
		// �Է��ϴ� for ��
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length -i-1; j++) {
				// 1ȸ���� ���� �� �� ������ �ڸ��� Ȯ���� ���� ū ���� �Ǿ��� ������ �˻� ����! (-i)
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// ����ϴ� for ��
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
