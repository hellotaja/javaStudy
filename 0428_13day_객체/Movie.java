
public class Movie {
	// 속성(필드)정의
	private String name;
	private int runningtime;
	
	public Movie() { // 기본 생성자 메소드
		
	}

	public Movie(String name, int runningtime) {
		super(); // -> 상속
		this.name = name;
		this.runningtime = runningtime;
	}

	public String getName() {
		return name;
	}

	public int getRunningtime() {
		return runningtime;
	}
	
	
}
