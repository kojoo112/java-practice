package ch06.static_member;

public class CalculatorExample {
	/*
	 * int x; // 인스턴스 멤버 int y; // 인스턴스 멤버
	 */
	int x2 = 20;
	int y2 = 30;

	// 정적 멤버
	static int x = 5; // 메소드 역역에 존재
	static int y = 5;

	// 정적 메소드 : 객체의 생성과는 무관하게 사용
	// 객체의 생성없이 동작
	// 정적 메소드에서는 정적 필드만 사용할 수 있음
	public static void main(String[] args) {
		x = 10; // 객체가 생성되어야만 사용할 수 있음. -> 에러
		y = 20;
		int sum = x + y;
		System.out.println("합 : " + sum);
	}

	// 인스턴스 메소드 : 객체가 생성된 후 호출되면 동작
	public void printAdd() {
		System.out.println(x2 + y2);
	}

}
