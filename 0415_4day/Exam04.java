import java.util.Random;

public class Exam04 {

	public static void main(String[] args) {
		// Random 클래스
		// 랜덤한 숫자 받아오기
		Random random = new Random();
		// random.nextInt(정수); > 난수 생성(0이상 정수 미만)
		// 1~ 20까지의 범위를 갖는 난수 생성
		int num = random.nextInt(20) + 1;
		System.out.println(num);
	}

}
