package ch06.constructor_define;

public class PhoneExample {

	public static void main(String[] args) {
		//폰을 생성 : new 연산자 + 생성자
		Phone p1 = new Phone();
		// 컴파일러가 자동으로 default 생성자를 생성
		Phone p2 = new Phone("홍길동");
		Phone p3 = new Phone("임영웅", "갤럭시S10");
	
	}
	
}
