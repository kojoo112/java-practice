package ch06.constructor_define;

public class Phone {

	String model = "갤럭시S10";	// 모든 객체를 생성할 때 값이 초기값으로 지정됨.
	String number;
	String owner;
	int lifeTime;
	
	// 생성자
	// default 생성자
	// 다른 생성자가 없으면 컴파일러가 자동으로 만들어 주지만
	// 다른 생성자가 있을 경우는 수동으로 정의를 해주어야 한다.
	public Phone() { }	// default 생성자
	
	// 매개변수가 있는 생성자 : String 타입
//	public Phone(String name) {
//		owner = name;
//	}
	
	// 위에 정의된 생성자와 구별을 못함 (컴파일러가)
	public Phone(String m) {	// 모델명을 초기값으로 지정
		model = m;		// 2. 초기화 : 실행되는 순서가 두번째.
	}
	
	// 매개변수 int
	// 다른 생성자와 매개변수의 타입이 다르면 다른 생성자로 판단.
	public Phone(int lifetime) {
		lifeTime = lifetime;
	}
	// 매개변수가 두개
	public Phone(String owner, String model) {
		// 매개변수 이름과 필드 이름이 같을 경우 매개변수와 필드를 구별하기위해
		// this을 사용 : 이 때 this은 Phone class를 말한다.
		this.owner = owner;
		this.model = model;
	}
	// 오버로딩(overloading)
	/* 메소드 오버로딩, 생성자 오버로딩
	 * 생성자를 여러개 정의할 수 있음
	 * 규칙: 1. 생성자이름 : class 이름
	 * 		2. 매개변수의 타입, 순서, 갯수가 다르면 허용
	 * 
	 */
	// 오버라이딩(overriding)
	public Phone(String owner, int lifetime) {
		this.owner = owner;
		this.lifeTime = lifetime;
	}
	
	// 순서가 다르다.
	public Phone(int lifetime, String model) {
		this.lifeTime = lifetime;
		this.model = model;
	}
/*	
	// 같은 데이터 타입을 사용하므로 구별을 못함. 위에 있는 것과 동일
	public Phone(int lifetime, String owner) {
		this.lifeTime = lifetime;
		this.owner = owner;
	}
*/	
}
