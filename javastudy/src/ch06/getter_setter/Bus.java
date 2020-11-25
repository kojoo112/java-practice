package ch06.getter_setter;

// 부모와 자식의 상속관계에 있을 때
public class Bus extends Car {
	// 클래스 Bus는 Car 클래스의 필드와 메소드를 가진다.
	// 직접 접근을 못하지만 값은 가지고 있음.
	// speed, stop
	// Getter, Setter
	void method() {
		// Car 클래스의 메소드를 사용할 수 있음.
		setSpeed(20);
		System.out.println("속도 = " + getSpeed());
	}
	
	// @Override : annotation
	// 자식이 setSpeed() 메소드를 재정의할 수 있다.
	@Override	// @Override : 부모의 메소드를 재정의한다는 표시
	// 컴파일러에게 알려준다. -> 정확하게 형식을 준수하는지 검사
	public void setSpeed(int s) {
		// bus의 방식대로 속도를 설정 : Car가 아니라
		// ...
	}
}
