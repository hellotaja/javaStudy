package sort;

public class SelectionSort_test {

	public static void main(String[] args) {
		int [] arr = new int[] {3, 6, 41, 2, 4, 1, 5, 70};
		
		int min;
		int temp;
		
		for(int i = 0; i < arr.length -1; i++) {
			min = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
