import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		// ArrayList >> �ڹ� �迭(array)�Ѱ踦 �غ��غ��� ���� ź��
		// �ڹ� �迭���� ũ�Ⱑ �����Ǿ��ִ� ������ �ذ�
		// �����͸� ���������� ������ �ڵ����� �Ҵ� > ���̽� ����Ʈ�� ���
		
		// 1. ArrayList �����ϱ�
		String [] arr = new String[3];
		
		// Arraylist Ŭ������ ���
		// <>�� Ÿ���� Ǯ���� �����־�� ��
		ArrayList<integer> arr2 = new ArrayList<integer>();
		
		// 2. ArrayList �� �ڿ� ������ �߰��ϱ�
		arr2.add("�̱⼺");
		arr2.add("�̸���");
		arr2.add("������");
		
		// 3. ������ ���
		// get(index) �޼ҵ带 ����ؼ� �� ���
		System.out.println(arr2.get(0));
		
		// 4. ��ü ������ ����ϱ� (�ݺ��� ���)
		System.out.println("=========================");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		
		// 5. ���ϴ� ��ġ�� ������ ���� �ֱ� add(index, ��)
		// ���������Ͱ� �ٲ�°� �ƴϰ� �ڷ� �и�
		arr2.add(2, "�Ǵ���");
		System.out.println("=========================");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		// 6. ������ ���� 
		// ������ ������ �ڸ��� ������
		arr2.remove(2);
		System.out.println("========================");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		// 7. ������ ��ü����
		arr2.removeAll(arr2);
		System.out.println("========================");
		for(int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}	

	}

}
