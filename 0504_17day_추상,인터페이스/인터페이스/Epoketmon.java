package �������̽�;

public interface Epoketmon {
	
	// �������̽� Ư¡
	// ���, �߻�޼��常 ������
	
	final String type = "����";
	int num = 123; //final Ű���带 ������ �ʾƵ� �������̽� �� ������ �׻� ���!
	
	public abstract void attack();
	public void moving(); //abstract Ű���� ������ �ʾƵ� �������̽� �� �޼���� �׻� �߻�޼���
	
	// �Ϲݸ޼��� �ۼ�
	// default - ������������ default x
	// �������̽� �ȿ� �Ϲݸ޼��带 �����ϱ� ���� Ű����
	public default void hello() {
		
	}
	
	// static
	public static void hello2() {
		
	}

}
