package LOL;

public class DragonExample {

	public static void main(String[] args) {
		Dragon d1 = new Dragon();

		System.out.println("용 종류 : " + d1.name);
		System.out.println("공격력 : " + d1.attackDamage);
		System.out.println("공격속도 : " + d1.attackSpeed);
		
		Dragon d2 = new Dragon("바람 드래곤", 1, 50);
		System.out.println("용 종류 : " + d2.name);
		System.out.println("공격력 : " + d2.attackDamage);
		System.out.println("공격속도 : " + d2.attackSpeed);
	}

}
