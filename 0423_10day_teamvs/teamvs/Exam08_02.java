package teamvs;

public class Exam08_02 {

	public static void main(String[] args) {
		   int sum = 0;

		      for (int i = 1; i <= 101; i++) {

		         if (i % 2 == 1) {
		            sum += i;
		            System.out.print(i + " ");
		         } else {
		            sum -= i;
		            System.out.print(-i + " ");
		         }

		      }
		      System.out.println();
		      System.out.println("°á°ú : " + sum);

	}

}
