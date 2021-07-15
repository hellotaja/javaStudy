package 추상_월급계산프로그램;

// RegularEmployee 와 TempEmployee 의 공통된 사항 뽑아오기
public abstract class Employee {
	private String empno; //protected 접근제한자는 자식메서드에서 사용가능
	private String name; // private : 같은 클래스 내에서만 사용
	private int pay;
	
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public abstract int getMoneyPay(); 
	//클래스마다 로직이 달라서 추상화로 강제성만 부여
	
	public String print() { //클래스마다 기능이 같기 때문에 일반메서드로 생성하여 상속
		return (empno+" : "+name+" : "+pay);
	}

	
	

}
