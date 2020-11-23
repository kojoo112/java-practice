package ch06.field_usage;

public class CarExample {

	public static void main(String[] args) {
		// Car클래스의 field speed에 접근하려면
//		speed = 10; (x)
		// 다른 클래스에 있는 필드에 접근하려면
		// 객체를 생성해서 참조변수를 통해서 접근할 수가 있다.
		Car myCar = new Car();	// 객체 생성
		myCar.speed = 70;
		
		
	}

}
