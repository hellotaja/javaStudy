
public class Exam04 {

	public static void main(String[] args) {
		// 2���� �迭 ���� 5��5��
		int [][] arr = new int [5][5];
		
		// �迭�� ������ �� for�� �ȿ��� 1�� ����
		int input = 1;
		
		// �迭�� ���� �����ϴ� �ݺ���
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr [i][j] = input;
				input++;
			}
		}
		
		// ����ϱ�
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}

	}

}
