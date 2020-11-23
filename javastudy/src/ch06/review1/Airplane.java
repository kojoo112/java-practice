package ch06.review1;

/*
 * 비행기
 * class 구성 멤버 : 상수(constant), 필드(field), 생성자(constructor), 메소드(method)
 * - 상수 : 변하지 않는 수(고정된 값)
 */

public class Airplane {
	// class -> 객체화(인스턴스화)
	// 상수 : static final (정적인)
	// static : 인스턴스화 (객체생성) 하지 않아도 존재
	
	public static final int MAX_PASSENGER = 400;
	// 필드 : 상태, 고유 데이터, 부품(구성품)
	int height;	// 고도
	int speed;	// 속도
	int cargo;	// 적재량
	String model;	// 기종 : 보인 747,...
	String company;	// 제조사
	Engine engine;
	Wheel frontWheel;
	Wheel rearWheel;
	Seat seat[];	// 좌석
	
	// 생성자 : -> 객체가 생성이 되면서 필드값을 초기화
	// 일종의 메소드 형식을 따르지만 반환형이 없음
	// 생성자의 특징(이름) : class 이름과 동일 
	
	public Airplane() {	}// default 생성자
		public Airplane(String model) {
			this.model = model;
	}
	
	public Airplane(String model, String company) {
		this.model = model;
		this.company = company;
	}
	
	// 메소드 : 동작을 정의 -> 필드값을 변경
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int geSpeed() {	// 비행기의 속도를 얻는다.
		return speed;
	}
	// 소프트웨어로는 생각하는대로 무엇이든지 할 수 있다.
	
	public void printModel() {
		System.out.println("모델 : " + model);
	}
}

class Engine{
	
}

class Wheel{
	
}

class Seat{
	
}
