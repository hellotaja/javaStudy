
public class Exam01_MovieMain {

	public static void main(String[] args) {
//		// Movie ��ü ����(�⺻������ ���)
//		Movie m = new Movie();
//		
//		// Movie ��ü ����(�����ε��� ������ ���)
//		Movie m2 = new Movie("�ظ�����", 120);
//	
//		System.out.println(m2.getName());
//		System.out.println(m2.getRunningtime());
	
		// 1. �迭�� ���� ���۷��� ����
		Movie[] movie_arr; // Ŭ������ �ϳ��� Ÿ������ ���� ��!
		
		// 2. ���۷��� �迭 ����
		movie_arr = new Movie[3];
		
		// 3. �迭�� ������ �ε������� ��ü ����
		movie_arr[0] = new Movie("�ظ�����", 120);
		movie_arr[1] = new Movie("�г�������", 130);
		Movie m = new Movie("��", 140);
		movie_arr[2] = m;
		
		System.out.println(movie_arr[0].getName());
		System.out.println(movie_arr[2].getRunningtime());
		
		// for-each�� Ȯ��for�� (0������ ������ �ݺ�) // �����̽� �ʿ��Ҷ� �Ϲ� for�� ����ϸ��
		// for(��������:�迭�̸�)
		for(Movie movie : movie_arr) {
			System.out.println(movie.getName());
			System.out.println(movie.getRunningtime());
		}
	}

}
