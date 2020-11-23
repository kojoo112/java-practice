package ch06.field_definition;

public class Car {
	// 필드 : 고유데이터, 상태, 부품(구성품)
	String company = "현대"; // 선언 + 초기값을 설정
	String model;
	String color;
	int maxSpeed;
	
	// 상태
	int speed;	// 속도
	int gas; 	// 연료량
	
	// 부품
	Body body;
	Engine engine;
	Tire tire;
}

class Body{
	
}

class Engine{}
class Tire{}
