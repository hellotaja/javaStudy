
public class Student {
	// DTO(Data Transfer Object) : �������� ������ ���� ��ü, ���� �����ϴ� �� ���
	// VO(Value Object) : ���Ǵ� ���� ��ü�� ǥ���Ǵ� ���, ���� ������ ����(setter x) - ���x
	// DAO(Data Access Object :
	``
	// �ʵ�(�Ӽ�)
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���.");
		//System.out.println("[ " + number + ", " + age + "�� ]");
		System.out.printf("[ %s, %d�� ]", getNumber(), getAge());
		System.out.println();
		System.out.println(name + "���� Java������ " + scoreJava + "�� �Դϴ�.");
		System.out.println(name + "���� Web������ " + scoreWeb + "�� �Դϴ�.");
		System.out.println(name + "���� Android������ " + scoreAndroid + "�� �Դϴ�.");
		System.out.println("===========================================================");
	}
	
	// �޼���(���)
	// 1. name �ʵ� �ʱ�ȭ(����)
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
		//this. : ���� ��ü �ڱ� �ڽ��� �ǹ�
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
