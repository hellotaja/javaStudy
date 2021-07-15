package wildanimal;

public class WildanimalMain {

	public static void main(String[] args) {
		
		WildAnimal wild = new WildAnimal();
		Lion lion = new Lion();
		// ��ĳ���� : ����Ŭ������ ����Ŭ���� Ÿ������ �ڵ� �� ��ȯ�ϴ� ��.
		// ��ü �� ��� ����, �޼ҵ忡 ������ �� ���� ���� Ŭ������ ����, �޼ҵ忡�� ���� ����.
		WildAnimal wild_lion = lion;
		WildAnimal wild2 = new Lion();
		
		Eagle eagle = new Eagle();
		
		WildAnimal wild3 = lion;
		WildAnimal wild4 = eagle;
		
		
		wild.hunt();
		lion.hunt();
		eagle.hunt();
		wild_lion.hunt();
		
		System.out.println(wild.type);
		System.out.println(lion.type);
		System.out.println(eagle.type);
		System.out.println(wild_lion.type);
		
		// �ٿ�ĳ���� : ��ĳ���� �� ���� ����(�����) ����ȯ�Ͽ� �ٽ� �ǵ����� ��
		Lion lion2 = (Lion) wild_lion; // ��������ȯ
		System.out.println(lion2.type);
		
		// ��ĳ������ �� ��� ���۷����� ����Ű�� ��ü�� ��¥ Ŭ���� Ÿ�� ������ �����
		// instanceof : ���۷���(����)�� ����Ű�� ��ü�� � Ŭ���� Ÿ������ ����
		// -> �ش� Ŭ���� Ÿ���� ��ü�̸� true ��ȯ, �ƴϸ� false ��ȯ
		System.out.println(wild2 instanceof Lion);
		System.out.println(wild3 instanceof Lion);
		System.out.println(wild4 instanceof Lion);
	}

}
