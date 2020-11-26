package ch07.polymorphism;

public class AnimalExample {

	public static void main(String[] args) {
		Cat cat  = new Cat();
		Animal animal1 = new Animal();
		Animal cat2 = new Cat();	// 부모클래스에 자식클래스를 대입
			// 자동 타입변환 : Cat이 Animal을 상속한 경우
		Dog dog1 = new Dog();
		Animal dog2 = new Dog();	// 자동 타입변환
			// 부모클래스에 자식클래스를 대입
//		Cat cat3 = new Dog();	// 다른 타입이므로 대입이 불가능

	}

}
