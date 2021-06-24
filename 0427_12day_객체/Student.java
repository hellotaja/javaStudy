
public class Student {
	// DTO(Data Transfer Object) : 데이터의 전송을 위한 객체, 값을 전달하는 데 사용
	// VO(Value Object) : 사용되는 값이 객체로 표현되는 경우, 값의 변경이 없음(setter x) - 기능x
	// DAO(Data Access Object :
	``
	// 필드(속성)
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public void show() {
		System.out.println(name + "님 안녕하세요.");
		//System.out.println("[ " + number + ", " + age + "살 ]");
		System.out.printf("[ %s, %d살 ]", getNumber(), getAge());
		System.out.println();
		System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android점수는 " + scoreAndroid + "점 입니다.");
		System.out.println("===========================================================");
	}
	
	// 메서드(기능)
	// 1. name 필드 초기화(설정)
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setAge(int age) {
		this.age = age;
		//this. : 현재 객체 자기 자신을 의미
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

}
