package toy;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine {
	ArrayList<Toy> toyList = new ArrayList<Toy>;
	
	Random rd = new Random();
	
	public void addToy(Toy x){
		toyList.add(x);
	}
	
	public Toy getToy() {
		int random = rd.nextInt(toyList.size())
		toyList.get(random);
	}

}
