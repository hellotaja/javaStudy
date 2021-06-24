
public class Exam01_MonitorMain {

	public static void main(String[] args) {
		// Monitor 객체 생성
		Monitor m = new Monitor();
		// m : 레퍼런스 변수(Monitor 객체의 주소값을 가지고 있음)

		// 필드 값 설정
		m.onoff = true;
		m.light = 50;
		
		// 메서드 호출
		m.on();
		m.lightup();
		
		System.out.println(m.getonoff());
		System.out.println(m.getlight());
	}

}
