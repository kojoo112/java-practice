package ch06.static_member;

public class CallExample {

	public static void main(String[] args) {
		
		// CalculatorExample 객체를 생성하지 않음
		System.out.println("x : " + CalculatorExample.x);
		// CalculatorExample의 PrintAdd() 실행하고 싶다.
		CalculatorExample ce = new CalculatorExample();
		System.out.println("x2 : " + ce.x2 + ", y2 : " + ce.y2);
		// 인스턴스 메소드
		ce.printAdd(); //

	}

}
