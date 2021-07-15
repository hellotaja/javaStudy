package toy;

public class Main {

	public static void main(String[] args) {
		
		RandomToyMachine rtm = new RandomToyMachine();
		
		rtm.addToy(new Ball()); // 자동으로 Toy로 형변환
		rtm.addToy(new Gun());
		rtm.addToy(new Train());
		
		Toy toy = rtm.getToy();
		toy.play();

	}

}
