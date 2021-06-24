
public class Exam01 {// 메소드

	public static void main(String[] args) {
		
		addNumber(10, 15);
		
		int value = addNumber2(8, 12);
		System.out.println("연산결과 : " + value);
		
		// 프로그램이 종료될 때마다 출력
		print();

	}
	
	
	
	
	public static void print() {
		// 메인메소드 밖에서 작성!
		// 매개변수와 반환값이 없는 메소드임.
		// 매개변수는 괄호 안에
		// 반환값은 return 반환값
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void addNumber(int num1, int num2) {
		//        ↑ 반환값이 없을때 쓰는 것
		// 매개변수 O, 반환값 X
		// 반환값이 있을 때 : 정수일때 - int / 실수일때 - float, double / 문자열 - string
		int result = num1 + num2;
		System.out.println("연산결과 : " + result);
	}
	
	public static int addNumber2(int num1, int num2) {
		//↑ 메소드의 사용 범위 지정 (↔ private)
		// 매개변수 O, 반환값 O
		int result = num1 + num2;
		System.out.println("결과는 : " + result);
		return result;
	}
	
}
