package ch06;

/*
 * class : 설계도
 * 대상을 정의
 * 형식 : public class ClassName {
 * }
 * Class 이름과 파일이름은 동일해야 함. -> public을 사용할 수 있다.
 * public : 누구나 접근할 수 있다.
 * 보통은 java 파일 하나에 class를 하나만 사용하는 것이 바람직하다.
 * 여러 개의 class를 사용하는 것은 간단한 프로그램을 만들 때
 */

public class Car {	// 파일 이름과 class 이름이 동일한 것은 public
	// 전제조건 : 이 파일내에서
	// 필드 : 특성, 부품(소유물), 상태, 정
	Handle handle;	// 소유
	Engine engine;
	String owner;	// 소유자
	String madeCompany;	//제조사
	int seatNum;		// 좌석수
	int speed;			// 속도
	int displacement;	// 배기량
	int oil;				// 기름의 양
	// ...
	// 생성자 : 객체를 생성하면서 필드를 초기
	public Car() {}	// 일종의 메소드(자바에서는 메소드, C언어)
	public Car (String owner) {	// Car 객체를 생성하면서
		// 필드 owner를 초기화 한다.
		this.owner = owner;
	}
	// 생성자는 여러 개 가능
	// 메소드 : 필드의 값을 변경하는 방법을 제공
	// 예) 매개변수(int speed)로 입력되는 값으로 필드의 값을 설정
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void accerlate(int amount) {
		this.speed += amount;
	}
	public void gasInject(int oil) {
		this.speed += oil;
	}
	
}

class Handle{
	
}

class Engine{
	
}

/*
 * 
 */