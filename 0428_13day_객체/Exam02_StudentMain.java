
public class Exam02_StudentMain {

	public static void main(String[] args) {
		Student[] stu_arr;
		stu_arr = new Student[2];
		
		stu_arr[0] = new Student("�����", 1, 10);
		stu_arr[1] = new Student("������", 2, 12);
		
//		System.out.println(stu_arr[0].getAll());
//		System.out.println(stu_arr[1].getAll());
		
		for(Student stu : stu_arr) {
			System.out.printf("%s, %d��, %d��%n", stu.getName(), stu.getBan(), stu.getNum());
		}
	}

}
