
public class Exam02_StudentMain {

	public static void main(String[] args) {
		Student[] stu_arr;
		stu_arr = new Student[2];
		
		stu_arr[0] = new Student("±è¹ÌÈñ", 1, 10);
		stu_arr[1] = new Student("ÀÌÀººñ", 2, 12);
		
//		System.out.println(stu_arr[0].getAll());
//		System.out.println(stu_arr[1].getAll());
		
		for(Student stu : stu_arr) {
			System.out.printf("%s, %d¹İ, %d¹ø%n", stu.getName(), stu.getBan(), stu.getNum());
		}
	}

}
