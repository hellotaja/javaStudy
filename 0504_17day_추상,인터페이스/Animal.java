// �߻�Ŭ����
// 1. �߻�޼��尡 �ϳ��� �ִ� Ŭ����
// 2. �߻�޼��尡 ������ abstract Ű���尡 �ٰ� �Ǹ� -> �߻�Ŭ����
public abstract class Animal {
	
	String type = "����";
	
	
	// �߻�޼��� ����
	public abstract void move();
	
	// �Ϲݸ޼��� ���� (�߻�Ŭ�����δ� ���Ұ�)
	public void eat() {
		System.out.println("�Դ�!");
	}

}
