// 다중상속 불가, 연이어 상속은 가능! (최상위 클래스 : object)
public class PhoneMain {

	public static void main(String[] args) {
		// Phone 객체 생성
		Phone p = new Phone();
		p.call();
		p.answercall();
		// 부모클래스는 자식클래스 기능 사용할 수 없습니다.
		
		// Smartphone 객체 생성
		Smartphone sp = new Smartphone();
		sp.internet();
		sp.playMusic();
		// 자식클래스는 부모클래스의 기능을 사용할 수 있습니다.
		sp.call();
		sp.answercall();

	}

}
