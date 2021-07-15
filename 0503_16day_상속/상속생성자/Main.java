package 상속생성자;

public class Main {

	public static void main(String[] args) {
		
		// C클래스 생성자가 호출 -> A클래스의 생성자가 실행 -> B클래스 생성자 실행
		// -> C클래스 생성자 실행
		new C();
		System.out.println();
		
		// 서브클래스 생성자가 먼저 호출이 되지만 슈퍼클래스의 생성자 먼저 실행
		// 슈퍼클래스가 먼저 초기화 된후 이를 활용하는 서브클래스가 초기화 되어야 함.
		// 슈퍼클래스에 생성자가 여러개 일때 -> 사용자가 따로 지정해주지 않으면 기본 생성자 호출
		
		
		new C(23);
		System.out.println();
		new C(3,5);
		System.out.println();
		
	}

}
