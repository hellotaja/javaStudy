package �߻�_���ް�����α׷�;

// RegularEmployee �� TempEmployee �� ����� ���� �̾ƿ���
public abstract class Employee {
	private String empno; //protected ���������ڴ� �ڽĸ޼��忡�� ��밡��
	private String name; // private : ���� Ŭ���� �������� ���
	private int pay;
	
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public abstract int getMoneyPay(); 
	//Ŭ�������� ������ �޶� �߻�ȭ�� �������� �ο�
	
	public String print() { //Ŭ�������� ����� ���� ������ �Ϲݸ޼���� �����Ͽ� ���
		return (empno+" : "+name+" : "+pay);
	}

	
	

}
