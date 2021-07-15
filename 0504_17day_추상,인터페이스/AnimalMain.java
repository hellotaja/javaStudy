
public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.move();
		dog.eat();
		
		//추상클래스로는 객체를 생성할 수 없음.
		//new Animal();

	}

}
