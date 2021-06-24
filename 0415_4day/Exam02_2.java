
public class Exam02_2 {

	public static void main(String[] args) {
		// 별그리기 예제 4 선생님 답 ★★★★ 나머지 반쪽 풀어보기
		for(int line = 0; line < 5; line++) {// 5줄 출력
			for(int blank = line; blank < 4; blank++) {
				System.out.print(" ");
			}
			for(int star = 0; star < 2 * line + 2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
