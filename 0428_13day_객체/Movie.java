
public class Movie {
	// �Ӽ�(�ʵ�)����
	private String name;
	private int runningtime;
	
	public Movie() { // �⺻ ������ �޼ҵ�
		
	}

	public Movie(String name, int runningtime) {
		super(); // -> ���
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
