
public class Exam01 {// �޼ҵ�

	public static void main(String[] args) {
		
		addNumber(10, 15);
		
		int value = addNumber2(8, 12);
		System.out.println("������ : " + value);
		
		// ���α׷��� ����� ������ ���
		print();

	}
	
	
	
	
	public static void print() {
		// ���θ޼ҵ� �ۿ��� �ۼ�!
		// �Ű������� ��ȯ���� ���� �޼ҵ���.
		// �Ű������� ��ȣ �ȿ�
		// ��ȯ���� return ��ȯ��
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
	
	public static void addNumber(int num1, int num2) {
		//        �� ��ȯ���� ������ ���� ��
		// �Ű����� O, ��ȯ�� X
		// ��ȯ���� ���� �� : �����϶� - int / �Ǽ��϶� - float, double / ���ڿ� - string
		int result = num1 + num2;
		System.out.println("������ : " + result);
	}
	
	public static int addNumber2(int num1, int num2) {
		//�� �޼ҵ��� ��� ���� ���� (�� private)
		// �Ű����� O, ��ȯ�� O
		int result = num1 + num2;
		System.out.println("����� : " + result);
		return result;
	}
	
}
