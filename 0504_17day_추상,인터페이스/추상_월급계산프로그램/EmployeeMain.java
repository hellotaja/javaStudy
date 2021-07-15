package 추상_월급계산프로그램;

public class EmployeeMain {

	public static void main(String[] args) {
		RegularEmployee re = new RegularEmployee("SMHRD001", "이명훈", 4000, 400); 
		//기본생성자 생성이 안되었기 때문에 매개변수 들어가야함
		
		System.out.println(re.getMoneyPay());
		System.out.println(re.print());
		
		TempEmployee te = new TempEmployee("SMHRD002", "강예진", 3000);
		
		System.out.println(te.getMoneyPay());
		System.out.println(te.print());
		
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003", "권누리", 5, 10);
		
		System.out.println(pe.getMoneyPay());
		System.out.println(pe.print());

	}

}
