import java.util.ArrayList;
import java.util.Scanner;

public class Exam02_ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> goods = new ArrayList<Product>();
		
		
		while(true) {
			System.out.print("[1]���� �߰� [2]���� �Ǹŷ� ��ȸ [3]���� >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("���� �̸� : ");
				String name = sc.next();
				System.out.print("�ܰ� : ");
				int price = sc.nextInt();
				System.out.print("���� : ");
				int amount = sc.nextInt();
						
				goods.add(new Product(name, price, amount));
				
				System.out.println();
				
			}else if(num == 2) {
				System.out.println("��ǰ��\t�ܰ�\t����");
				int total = 0;
				for(Product good : goods) {
					System.out.println(good.getName() + "\t" + good.getUnitPrice() + "\t" + good.getAmount());
					total += good.getUnitPrice() * good.getAmount();
				}
				System.out.println("�ǸŽ� ���� : " + total);
				System.out.println();
				
			}else if(num == 3) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
		

	}

}
