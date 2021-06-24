
public class 접근제한자 {
	// 접근제한자 종류
	// 1. public : 모든 접근 허용
	public int a = 1;
	
	// 2. protected : 같은 패키지에 있는 클래스와 상속관계의 객체들만 접근 허용
	protected int b = 2;
	
}	// 3. default : 같은 패키지에 있는 클래스만 접근 허용 (아무것도 안적을시)
	int c = 3;
	
	// 4. private : 현재 클래스 내에서만 접근 허용 (캡슐화)
	private int d = 4;
	
