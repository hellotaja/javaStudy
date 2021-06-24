package sort;

public class BubbleSort_test {

	public static void main(String[] args) {
		int [] arr = new int [] {8, 6, 25, 81, 17, 1, 0, 3, 7, 9, 13, 58, 61};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
