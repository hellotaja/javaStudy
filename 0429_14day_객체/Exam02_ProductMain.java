import java.util.ArrayList;
import java.util.Scanner;

public class Exam02_ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> goods = new ArrayList<Product>();
		
		
		while(true) {
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("물건 이름 : ");
				String name = sc.next();
				System.out.print("단가 : ");
				int price = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
						
				goods.add(new Product(name, price, amount));
				
				System.out.println();
				
			}else if(num == 2) {
				System.out.println("제품명\t단가\t수량");
				int total = 0;
				for(Product good : goods) {
					System.out.println(good.getName() + "\t" + good.getUnitPrice() + "\t" + good.getAmount());
					total += good.getUnitPrice() * good.getAmount();
				}
				System.out.println("판매시 매출 : " + total);
				System.out.println();
				
			}else if(num == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		

	}

}
