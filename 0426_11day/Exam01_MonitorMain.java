
public class Exam01_MonitorMain {

	public static void main(String[] args) {
		// Monitor ��ü ����
		Monitor m = new Monitor();
		// m : ���۷��� ����(Monitor ��ü�� �ּҰ��� ������ ����)

		// �ʵ� �� ����
		m.onoff = true;
		m.light = 50;
		
		// �޼��� ȣ��
		m.on();
		m.lightup();
		
		System.out.println(m.getonoff());
		System.out.println(m.getlight());
	}

}
