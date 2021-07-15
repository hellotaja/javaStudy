package 추상_월급계산프로그램;

public class RegularEmployee extends Employee {

	private int bouns;
	
	public RegularEmployee(String empno, String name, int pay, int bouns) {
		super(empno, name, pay); //부모클래스의 생성자 가져오기
		this.bouns = bouns;
	}
	
	//추상메서드를 오버라이딩
	public int getMoneyPay() {
		return (pay+bouns)/12;
	}
	
}
