
public class Piggybank {
	// �Ӽ� : �ݾ�(money) - ������
	// �ܺο��� �������� ���ϵ��� ����
	private int money;
	
	
	
	// ��� :
	// 1. ���� �ִ´�(deposit) - �Ű�����(o)-���� ��
	// -> ���� �ݾ׿��� �־��� �� ��ŭ ����
	public void deposit(int plus) {
		money += plus;
	}
	
	// 2. ���� �����ϴ�(withdraw) - �Ű�����(o)-������ ��
	// -> ���� �ݾ׿��� ������ �� ��ŭ ����
	public void withdraw(int minus) {
		money -= minus;
	}
	
	// 3. �ܾ��� �����ִ�(showMoney) - �Ű�����(x)
	// -> ���� �ݾ� ���
	public void showMoney() {
		System.out.println("���� ���� �ܾ� : " + money);
	}
}
