package �߻�_���ް�����α׷�;

public class RegularEmployee extends Employee {

	private int bouns;
	
	public RegularEmployee(String empno, String name, int pay, int bouns) {
		super(empno, name, pay); //�θ�Ŭ������ ������ ��������
		this.bouns = bouns;
	}
	
	//�߻�޼��带 �������̵�
	public int getMoneyPay() {
		return (pay+bouns)/12;
	}
	
}
