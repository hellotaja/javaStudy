package 상속생성자;

public class C extends B{
	
	public C() {
		super(); // 부모클래스의 기본생성자(매개변수가 없는 생성자) 호출 
		// super : 부모,  this : 자기자신
		System.out.println("C()실행!");
	}
	
	public C(int x) {
		super(x);
		
	}
	
	public C(int i, int j) {
		super(i, j);
		System.out.println("C(X,Y) 실행!");
	}
	
	public void printb() {
		System.out.println(this.b);
	}

}
