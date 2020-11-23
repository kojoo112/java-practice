package ch06.static_member;

public class Calculator {
	String color;	// 인스턴스 멤버
	public void setColor(String color) {	// 인스턴스 메소드
		this.color = color;	// Error 안남
	}
	// 정적 메소드 : 객체의 생성과는 무관하게 존재
	static int plus(int x, int y) {
//		color = "yellow";	// Error
							// 인스턴스 멤버 -> 객체 생성
			// 메소드는 객체의 생성과는 무관
			// 객체가 생성되지 않았을 때 실행될 수 있음.
		return x + y;
	}
}
