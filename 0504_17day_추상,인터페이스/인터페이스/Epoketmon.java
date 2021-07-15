package 인터페이스;

public interface Epoketmon {
	
	// 인터페이스 특징
	// 상수, 추상메서드만 존재함
	
	final String type = "전기";
	int num = 123; //final 키워드를 붙이지 않아도 인터페이스 내 변수는 항상 상수!
	
	public abstract void attack();
	public void moving(); //abstract 키워드 붙이지 않아도 인터페이스 내 메서드는 항상 추상메서드
	
	// 일반메서드 작성
	// default - 접근제한자의 default x
	// 인터페이스 안에 일반메서드를 선언하기 위한 키워드
	public default void hello() {
		
	}
	
	// static
	public static void hello2() {
		
	}

}
