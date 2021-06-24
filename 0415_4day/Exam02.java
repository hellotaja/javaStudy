
public class Exam02 {

	public static void main(String[] args) {
		// 별그리기 예제 4
		for(int line = 1; line <= 10; line++) {
			if(line <= 5) {
				for(int j = 1; j <= (5 - line); j++) {
					System.out.print(" ");
				}
			    for(int n = 1; n <= line * 2; n++) {
			    	System.out.print("*");
			    }
			}
			else if(line >= 6) {
				for(int blank = 1; blank <= line - 6; blank++) {
					System.out.print(" ");
				}
				for(int star = 1; star <= (11-line) * 2; star++) {
					System.out.print("*");
				}
			}System.out.println();
		}	
	}
}
