
public class Exam07 {

	public static void main(String[] args) {
		// 메소드 오버로딩
		// 메소드 이름은 동일하게 사용하고 매개변수를 다르게 하여서 여러개의 메소드를 만드는 기법
		System.out.println(plus(1, 2));
		System.out.println(plus(1.1, 2.4));
	}
	
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	public static double plus(double num1, double num2) {
		return num1 + num2;
	}
}
