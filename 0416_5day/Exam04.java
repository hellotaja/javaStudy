
public class Exam04 {

	public static void main(String[] args) {
		// 2차원 배열 생성 5행5열
		int [][] arr = new int [5][5];
		
		// 배열에 대입할 값 for문 안에서 1씩 증가
		int input = 1;
		
		// 배열에 값을 대입하는 반복문
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr [i][j] = input;
				input++;
			}
		}
		
		// 출력하기
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}

	}

}
