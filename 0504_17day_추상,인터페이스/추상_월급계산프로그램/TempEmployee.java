package �߻�_���ް�����α׷�;

public class TempEmployee extends Employee {
	private String empno;
	private String name;
	private int pay;
	
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		return pay/12;
	}
}
