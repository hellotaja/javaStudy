
public class Exam01_MovieMain {

	public static void main(String[] args) {
//		// Movie 객체 생성(기본생성자 사용)
//		Movie m = new Movie();
//		
//		// Movie 객체 생성(오버로딩된 생성자 사용)
//		Movie m2 = new Movie("해리포터", 120);
//	
//		System.out.println(m2.getName());
//		System.out.println(m2.getRunningtime());
	
		// 1. 배열에 대한 레퍼런스 변수
		Movie[] movie_arr; // 클래스를 하나의 타입으로 보는 것!
		
		// 2. 레퍼런스 배열 생성
		movie_arr = new Movie[3];
		
		// 3. 배열의 각각의 인덱스마다 객체 생성
		movie_arr[0] = new Movie("해리포터", 120);
		movie_arr[1] = new Movie("분노의질주", 130);
		Movie m = new Movie("명량", 140);
		movie_arr[2] = m;
		
		System.out.println(movie_arr[0].getName());
		System.out.println(movie_arr[2].getRunningtime());
		
		// for-each문 확장for문 (0번부터 끝까지 반복) // 슬라이싱 필요할땐 일반 for문 사용하면됨
		// for(변수선언:배열이름)
		for(Movie movie : movie_arr) {
			System.out.println(movie.getName());
			System.out.println(movie.getRunningtime());
		}
	}

}
