package ��ӻ�����;

public class B extends A{
	
	protected int b = 12;
	
	public B() {
		System.out.println("B()����!");
	}
	
	public B(int x) {
		System.out.println("B(x)����!");
	}
	
	public B(int i, int j) {
		super(i, j);
		System.out.println("B(X,Y) ����!");
	}

}
