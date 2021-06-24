
public class Student {
	private String name;
	private int ban;
	private int num;
	
	public Student() {
		
	}
	
	public Student(String name, int ban, int num) {
		super();
		this.name = name;
		this.ban = ban;
		this.num = num;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getAll() {
		return (name + ", " + ban + "¹İ, " + num +"¹ø");
		
	}
	
}
