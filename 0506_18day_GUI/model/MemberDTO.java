package model;

public class MemberDTO {
	// DTO(Data Transfer Object) : 데이터의 전송을 위한 객체, 값을 전달하는 데 사용
	
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String hobby;
	
	// 생성자 메소드
	// 리턴타입X
	// 클래스의 이름이 같음
	
	public MemberDTO(String id, String pw, String name, String gender, String hobby) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.gender = gender;
		this.hobby = hobby;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	

	
	
	

}
