
public class Exam03 {

	public static void main(String[] args) {
		// ����� ������ ���ϴ� �޼ҵ�
		System.out.println(getSum(7));
		System.out.println(getSum(26));
		System.out.println(getSum(24));

	}
	
	public static int getSum(int num1) {
		int sum = 0;
		
		for(int i = 1; i < num1; i++) {
			if(num1 % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
