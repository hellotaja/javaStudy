
public class Exam06_2 {

	public static void main(String[] args) {
		// �� ���
		// �Ǻ���ġ ���� 1 1 2 3 5 8 ... 
		System.out.println(getPibo(1));
		System.out.println(getPibo(2));
		System.out.println(getPibo(3));
		System.out.println(getPibo(4));
		System.out.println(getPibo(5));
	}
	
	public static int getPibo(int num) {
		if (num == 1) {
			return 1;
		}else if(num == 2) {
			return 1;
		}else {// �޼ҵ� �ȿ��� �޼ҵ尡 �۵�
			return getPibo(num - 2) + getPibo(num - 1);
		}
	}
}
