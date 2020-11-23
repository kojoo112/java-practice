package ch06.field_usage;

public class Car {
	// 필드
	int speed;	// 클래스내('{' ~ '}') 에서는 어디서든지 사용
	// 생성자
	public Car() {
		speed = 0;
	}
	public Car(int speed) {
		// 매개변수와 필드 값이 동일한 이름을 가질 경우
		// 필드를 매개변수와 구별하기 위해서 this. 을 붙여준다.
		// this : Car
		this.speed = speed;
	}
}
