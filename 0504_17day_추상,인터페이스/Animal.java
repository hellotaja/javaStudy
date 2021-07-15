// 추상클래스
// 1. 추상메서드가 하나라도 있는 클래스
// 2. 추상메서드가 없더라도 abstract 키워드가 붙게 되면 -> 추상클래스
public abstract class Animal {
	
	String type = "동물";
	
	
	// 추상메서드 정의
	public abstract void move();
	
	// 일반메서드 정의 (추상클래스로는 사용불가)
	public void eat() {
		System.out.println("먹다!");
	}

}
