package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = new int[] {3, 6, 41, 2, 4, 1, 5, 70};
		
		// 입력하는 for 문
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length -i-1; j++) {
				// 1회전이 끝난 후 맨 마지막 자리는 확실히 제일 큰 값이 되었기 떄문에 검사 생략! (-i)
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// 출력하는 for 문
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
