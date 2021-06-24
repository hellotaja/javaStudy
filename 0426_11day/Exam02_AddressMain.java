
public class Exam02_AddressMain {

	public static void main(String[] args) {
		
		// Address 객체 생성
		Address add = new Address();
		// add : 레퍼런스 변수, address 객체의 주소값을 가지고 있음
		
		add.name = "권누리";
		add.address = "남구";
		add.num = 1253;

		add.showAddr();
		
		
		
		Address add2 = new Address();
		add2.name = "안광영";
		add2.address = "요기없음";
		add2.num = 9887;
		add2.showAddr();
		
		
	}

}
