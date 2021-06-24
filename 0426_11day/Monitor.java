
public class Monitor {
// 클래스나 메소드 생성시에는 이름 첫글자 통상 대문자 사용! (변수와 구분하기 위해)
// Monitor 클래스 작성
// 클래스 : 객체를 생성하기 위한 도면, 설계도
	
	// 1. 속성(필드)
	boolean onoff; // 전원
	int light; // 밟기
	
	// 2. 기능(메소드)
	public boolean getonoff() {
		return onoff;
	}
	// static : 정적 
	// 메모리 공간 : static(프로그램 종료시까지 메모리에 할당된 채 존재) - 가비지컬렉션 관여X 
				// heap - 가비지컬렉션 관여O
	// 모든 객체가 공유
	// -> static 붙어있지 않은 메소드, 변수 사용 -> 객체 반드시 생성해야함 ex) random.nextInt()
	// -> static 붙어있는 메소드, 변수 -> 객체를 생성하지 않아도 사용가능 ex) Math.pow()
	
	public int getlight() {
		return light;
	}
	
	// 밝기 올리는 기능
	public void lightup( ) {
		// 밝기 1 올리기
		light++;
		System.out.println("밝기 올리기");
	}
	// 밝기 내리는 기능
	public void lightdown( ) {
		// 밝기 1 내리기
		light--;
		System.out.println("밝기 내리기");
	}
	// 전원 켜는 기능
	public void on( ) {
		// 현재 전원상태를 true로 만들기
		onoff = true;
		System.out.println("전원 켜기");
	}
	// 전원 끄는 기능
	public void off() {
		// 현재 전원상태를 false로 만들기
		onoff = false;
		System.out.println("전원 끄기");
	}
}
