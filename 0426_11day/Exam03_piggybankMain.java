
public class Exam03_piggybankMain {

	public static void main(String[] args) {
		Piggybank bank = new Piggybank();
		
		bank.money = 0;
		bank.deposit(1000);
		bank.deposit(10000);
		bank.withdraw(2000);
		bank.showMoney();
		

	}

}
