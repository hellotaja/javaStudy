
public class Monitor {
// Ŭ������ �޼ҵ� �����ÿ��� �̸� ù���� ��� �빮�� ���! (������ �����ϱ� ����)
// Monitor Ŭ���� �ۼ�
// Ŭ���� : ��ü�� �����ϱ� ���� ����, ���赵
	
	// 1. �Ӽ�(�ʵ�)
	boolean onoff; // ����
	int light; // ���
	
	// 2. ���(�޼ҵ�)
	public boolean getonoff() {
		return onoff;
	}
	// static : ���� 
	// �޸� ���� : static(���α׷� ����ñ��� �޸𸮿� �Ҵ�� ä ����) - �������÷��� ����X 
				// heap - �������÷��� ����O
	// ��� ��ü�� ����
	// -> static �پ����� ���� �޼ҵ�, ���� ��� -> ��ü �ݵ�� �����ؾ��� ex) random.nextInt()
	// -> static �پ��ִ� �޼ҵ�, ���� -> ��ü�� �������� �ʾƵ� ��밡�� ex) Math.pow()
	
	public int getlight() {
		return light;
	}
	
	// ��� �ø��� ���
	public void lightup( ) {
		// ��� 1 �ø���
		light++;
		System.out.println("��� �ø���");
	}
	// ��� ������ ���
	public void lightdown( ) {
		// ��� 1 ������
		light--;
		System.out.println("��� ������");
	}
	// ���� �Ѵ� ���
	public void on( ) {
		// ���� �������¸� true�� �����
		onoff = true;
		System.out.println("���� �ѱ�");
	}
	// ���� ���� ���
	public void off() {
		// ���� �������¸� false�� �����
		onoff = false;
		System.out.println("���� ����");
	}
}
