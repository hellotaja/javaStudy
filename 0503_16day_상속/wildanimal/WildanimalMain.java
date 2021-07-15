package wildanimal;

public class WildanimalMain {

	public static void main(String[] args) {
		
		WildAnimal wild = new WildAnimal();
		Lion lion = new Lion();
		// 업캐스팅 : 하위클래스가 상위클래스 타입으로 자동 형 변환하는 것.
		// 객체 내 모든 변수, 메소드에 접근할 수 없고 상위 클래스의 변수, 메소드에만 접근 가능.
		WildAnimal wild_lion = lion;
		WildAnimal wild2 = new Lion();
		
		Eagle eagle = new Eagle();
		
		WildAnimal wild3 = lion;
		WildAnimal wild4 = eagle;
		
		
		wild.hunt();
		lion.hunt();
		eagle.hunt();
		wild_lion.hunt();
		
		System.out.println(wild.type);
		System.out.println(lion.type);
		System.out.println(eagle.type);
		System.out.println(wild_lion.type);
		
		// 다운캐스팅 : 업캐스팅 된 것을 강제(명시적) 형변환하여 다시 되돌리는 것
		Lion lion2 = (Lion) wild_lion; // 강제형변환
		System.out.println(lion2.type);
		
		// 업캐스팅을 한 경우 레퍼런스가 가리키는 객체의 진짜 클래스 타입 구분이 어려움
		// instanceof : 레퍼런스(변수)가 가리키는 객체가 어떤 클래스 타입인지 구분
		// -> 해당 클래스 타입의 객체이면 true 반환, 아니면 false 반환
		System.out.println(wild2 instanceof Lion);
		System.out.println(wild3 instanceof Lion);
		System.out.println(wild4 instanceof Lion);
	}

}
