
public class Exam01 {

	public static void main(String[] args) {
		// 2���� ���� base, n�� �޾� base�� n �����ϴ� �Լ� �����
		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("���Ȯ�� : " + result);
	}
	
	public static int powerN(int base, int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * base;
		}
		return result;
	}

}
