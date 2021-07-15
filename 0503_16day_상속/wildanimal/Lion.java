package wildanimal;

// 자식클래스1
public class Lion extends WildAnimal{
	
	// 오버라이딩 : 부모클래스가 가지고 있는 기능을 재정의해서 사용하는 것
	// 부모클래스의 메소드와 동일한 이름, 매개변수, 타입, 개수, 리턴타입 모두 동일하게 작성
	// 부모클래스 메소드 접근지정자보다 접근의 범위 좁혀서 오버라이딩 할 수 없음
	// static, private, final 로 선언된 메서드는 오버라이딩 할 수 없음
	// annotation(주석문) : 컴파일러에게 오버라이딩이 정확한지 확인하도록 지시
	
	String type = "사자";
	
	@Override
	public void hunt() {
		System.out.println("단독사냥");
	}

}
