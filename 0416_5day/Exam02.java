
public class Exam02 {

	public static void main(String[] args) {
		// �ǽ�����
		int arr [] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.print("array�� ����ִ� ¦���� ");
		for(int iseven = 2; iseven < 10; iseven++) {
			if(arr[iseven] % 2 == 0) {
				System.out.print(arr[iseven] + " ");
			}
		}System.out.println("�Դϴ�.");
		
		// �ǽ����� 2 (�̹��� Ȧ�� �Է�)
		int cnt = 0;
		
		System.out.print("array�� ����ִ� Ȧ���� ");
		for(int isodd = 1; isodd < 10; isodd++) {
			if(arr[isodd] % 2 != 0) {
				System.out.print(arr[isodd] + " ");
				cnt++;
			}
		}System.out.println("�̸�");
		System.out.println("�� " + cnt + "�� �Դϴ�");

	}

}
