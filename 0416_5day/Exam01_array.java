
public class Exam01_array {

	public static void main(String[] args) {
		// 1. �迭 ����
		int [] arr = new int[4];
		
		// 2. ������ �迭�� �� ����ֱ�
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		// 3. ������ ���ÿ� �� ����ֱ�
		int [] arr1 = {1, 2, 3, 4};
		
		// 0���� 9����
		int [] arr2 = new int[10];
		for(int i = 0; i < 10; i++) {
			arr2[i] = i;
			System.out.println(arr2[i]);
		}
		// arr2 : 10���� ���� ����
		// 0 ~ 9������ �����Ͱ� �������
		
		// �迭�� ũ�⸦ ����ϴ� arr2.length�� ����Ͽ� �迭�� ũ�Ⱑ ���� ������
		// �ٸ� �ڵ忡 ������ �ʿ����� �ʰԲ� �Ѵ�!
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i;
			
		
		}
	}

}
