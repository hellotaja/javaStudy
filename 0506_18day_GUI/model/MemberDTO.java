package model;

public class MemberDTO {
	// DTO(Data Transfer Object) : �������� ������ ���� ��ü, ���� �����ϴ� �� ���
	
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String hobby;
	
	// ������ �޼ҵ�
	// ����Ÿ��X
	// Ŭ������ �̸��� ����
	
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
