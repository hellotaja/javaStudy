
public class Exam03_2 {

	public static void main(String[] args) {
		// for ���� ���� �迭 �� �ֱ�
		
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
// ��ü �ּ�ó�� �ϴ� �� : ��ü���� + ctrl + ������
	}

}
