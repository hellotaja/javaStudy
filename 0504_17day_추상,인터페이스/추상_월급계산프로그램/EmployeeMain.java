package �߻�_���ް�����α׷�;

public class EmployeeMain {

	public static void main(String[] args) {
		RegularEmployee re = new RegularEmployee("SMHRD001", "�̸���", 4000, 400); 
		//�⺻������ ������ �ȵǾ��� ������ �Ű����� ������
		
		System.out.println(re.getMoneyPay());
		System.out.println(re.print());
		
		TempEmployee te = new TempEmployee("SMHRD002", "������", 3000);
		
		System.out.println(te.getMoneyPay());
		System.out.println(te.print());
		
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003", "�Ǵ���", 5, 10);
		
		System.out.println(pe.getMoneyPay());
		System.out.println(pe.print());

	}

}
