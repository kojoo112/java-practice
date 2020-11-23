package ch06.constructor_define;

public class Car {
	// 필드
	int speed;		// 세미콜론(';')
	String company;
	String model;
	int seatNum;
	int gas;
	
	// 생성자
	// new 연산자를 사용해서 객체를 생성하면서 필드 값을 초기화
	// 형식
	// default 생성자 : 매개변수가 없는 생성자
	// 정의하지 않아도 컴파일러가 자동으로 생성을 해준다.
	// 매개변수로 자동차 제조사의 정보를 입력받아서 초기화
//	public Car() { }	// default 생성자
	// 디폴트생성자는 다른 생성자가 있을 경우 컴파일러는 자동 생성해주지않는다.
	
	// 매개변수가 있는 생성자
	public Car(String c) {
		company = c;
	}
	public Car( /* 매개변수 */) { 
		
	} /* 생성자의 끝 */ // 메소드의 끝에는 ';'을 쓰지 않는다.
}
