package 惑加积己磊;

public class B extends A{
	
	protected int b = 12;
	
	public B() {
		System.out.println("B()角青!");
	}
	
	public B(int x) {
		System.out.println("B(x)角青!");
	}
	
	public B(int i, int j) {
		super(i, j);
		System.out.println("B(X,Y) 角青!");
	}

}
