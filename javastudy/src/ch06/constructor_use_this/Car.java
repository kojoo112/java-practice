package ch06.constructor_use_this;

public class Car {
	// 필드 
	String model;	// 모델명
	String color;	// 색깔
	int maxSpeed;	// 최대속도
	
	// 생성자
	public Car(String model) {
		this(model, "Silver", 250);	// this : class Car
		// 다른 생성자를 호출할 수 있음.
		/*
		this.model = model;
		color = "Silver";	// 매개변수로 받지 않아도 초기화 할 수 있음.
		maxSpeed = 250;
		*/
	}
	
	/*
	public Car(String model){
		this(model, "Silver");
		
	} 
	 */
	
	// 생성자 오버로딩 : 매개변수의 타입, 개수, 순서가 다르면 허용
	public Car(String model, String color) {
		this(model, color, 300);	// 아래 문장보다 간단함.
		/*
		this.model = model;
		this.color = color;
		maxSpeed = 300;
		*/
	}
	
	// 아래와 같다.
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
}
