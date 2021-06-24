
public class Exam01_array {

	public static void main(String[] args) {
		// 1. 배열 생성
		int [] arr = new int[4];
		
		// 2. 생성된 배열에 값 집어넣기
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		// 3. 생성과 동시에 값 집어넣기
		int [] arr1 = {1, 2, 3, 4};
		
		// 0부터 9까지
		int [] arr2 = new int[10];
		for(int i = 0; i < 10; i++) {
			arr2[i] = i;
			System.out.println(arr2[i]);
		}
		// arr2 : 10개의 공간 존재
		// 0 ~ 9까지의 데이터가 담겨있음
		
		// 배열의 크기를 출력하는 arr2.length를 사용하여 배열의 크기가 변할 때에도
		// 다른 코드에 변경이 필요하지 않게끔 한다!
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i;
			
		
		}
	}

}
