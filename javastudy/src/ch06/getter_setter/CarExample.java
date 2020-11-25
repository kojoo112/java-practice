package ch06.getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
//		myCar.speed = -20;	// 오류를 범할 수 있음.
//		System.out.println(myCar.speed);
		// 현실 세계에서는 -속도 없음
		// 프로그램에서는 - 값을 대입하면 존재할 수 있음.
		// 오류를 막으려면 메소드를 사용해서 입력값을 먼저 확인
		myCar.setSpeed(-20);

	}

}
