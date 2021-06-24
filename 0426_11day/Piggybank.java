
public class Piggybank {
	// 속성 : 금액(money) - 정수형
	// 외부에서 접근하지 못하도록 막음
	private int money;
	
	
	
	// 기능 :
	// 1. 돈을 넣는다(deposit) - 매개인자(o)-넣을 돈
	// -> 현재 금액에서 넣어준 돈 만큼 증가
	public void deposit(int plus) {
		money += plus;
	}
	
	// 2. 돈을 인출하다(withdraw) - 매개인자(o)-인출한 돈
	// -> 현재 금액에서 인출한 돈 만큼 감소
	public void withdraw(int minus) {
		money -= minus;
	}
	
	// 3. 잔액을 보여주다(showMoney) - 매개인자(x)
	// -> 현재 금액 출력
	public void showMoney() {
		System.out.println("현재 계좌 잔액 : " + money);
	}
}
