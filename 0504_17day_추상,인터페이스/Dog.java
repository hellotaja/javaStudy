
public class Dog extends Animal {
	//추상클래스를 상속받는 경우에는 추상메서드를 꼭 구현해줘야함(강제성)
	@Override
	public void move() {
		
		System.out.println("강아지 움직여요!");
	}

}
