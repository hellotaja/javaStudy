
public class Exam04 {

	public static void main(String[] args) {
		// �Ű������� ���������� �ƴ��� ���� ��ȯ�ϴ� �޼ҵ�
		System.out.println(isPerfect(7));
		System.out.println(isPerfect(6));

	}
	public static boolean isPerfect(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
}
