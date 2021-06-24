
public class Exam01 {

	public static void main(String[] args) {
		// 별모양 예제 3
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}for(int n = 1; n <= i; n++) {
				System.out.print("*");
			}System.out.println();
		}
		
		// 선생님 답 (2중 for문을 한개만 사용해도 가능!)
		for(int line = 0; line <= 4; line++) {
			for(int star = 4; star >= 0; star--) {
				if(star > line) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}

	}

}
