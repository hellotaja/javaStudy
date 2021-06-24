
public class Exam03_2 {

	public static void main(String[] args) {
		// for 문을 통해 배열 값 넣기
		
		int [][] arr = new int [2][2];
		
		int input = 1;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = input;
				input++;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
// 전체 주석처리 하는 법 : 전체선택 + ctrl + 슬래시
	}

}
