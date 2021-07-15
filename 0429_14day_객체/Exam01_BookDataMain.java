import java.util.ArrayList;
import java.util.Scanner;

public class Exam01_BookDataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BookData[] book_arr = new BookData[5];
		
		// BookData arraylist 생성
		ArrayList<BookData> al = new ArrayList<BookData>();
		al.add(new BookData("Java", 21000, "홍길동"));
		al.add(new BookData("Andriod", 18000, "이순신"));
		
		for(int i = 0; i<al.size(); i++) {
			System.out.printf("[%s, %s, %d원]%n", al.get(i).getTitle(), al.get(i).getWriter(), al.get(i).getPrice());

		}
		
		
		book_arr[0] = new BookData("Java", 21000, "홍길동");
		book_arr[1] = new BookData("C++", 29000, "박문수");
		book_arr[2] = new BookData("Database", 31000, "김장독");
		book_arr[3] = new BookData("Andriod", 18000, "이순신");
		book_arr[4] = new BookData("Web", 26000, "김철수");
		
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.println("구매 가능한 책 목록");
		for(int i = 0; i < book_arr.length; i++) {
			int price = book_arr[i].getPrice();
			if(price <= money) {
				System.out.printf("[%s, %s, %d원]%n", book_arr[i].getTitle(), book_arr[i].getWriter(), book_arr[i].getPrice());
			} 
			
		}

	}

}
