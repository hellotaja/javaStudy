package ��ӻ�����;

public class C extends B{
	
	public C() {
		super(); // �θ�Ŭ������ �⺻������(�Ű������� ���� ������) ȣ�� 
		// super : �θ�,  this : �ڱ��ڽ�
		System.out.println("C()����!");
	}
	
	public C(int x) {
		super(x);
		
	}
	
	public C(int i, int j) {
		super(i, j);
		System.out.println("C(X,Y) ����!");
	}
	
	public void printb() {
		System.out.println(this.b);
	}

}
