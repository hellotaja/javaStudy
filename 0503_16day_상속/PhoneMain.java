// ���߻�� �Ұ�, ���̾� ����� ����! (�ֻ��� Ŭ���� : object)
public class PhoneMain {

	public static void main(String[] args) {
		// Phone ��ü ����
		Phone p = new Phone();
		p.call();
		p.answercall();
		// �θ�Ŭ������ �ڽ�Ŭ���� ��� ����� �� �����ϴ�.
		
		// Smartphone ��ü ����
		Smartphone sp = new Smartphone();
		sp.internet();
		sp.playMusic();
		// �ڽ�Ŭ������ �θ�Ŭ������ ����� ����� �� �ֽ��ϴ�.
		sp.call();
		sp.answercall();

	}

}
