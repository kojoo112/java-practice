package ch06.static_initial;

/*
 * 싱글톤(SingleTon) : 프로그램에서 객체가 하나만 존재
 */

public class SingleTon {
	// 시간정보를 가지고 있는 Calendar 클래스
	// 시간을 여러 객체에서 관리하면 안됨
	// 여러개의 오차가 있는 시계가 있으면 혼란 야기 -> 한 개만 존재
	// 데이터 저장 : 데이터를 관리하는 객체가 여러 개 있으면 안됨.
	// 싱글톤을 만드는 방법
	/* 1. 객체는 1개만 존재 : new 연산자 + 생성자로 호출할 수 없어야 함.
	 * 
	 * 
	 */
	// private : 나 자신만이 호출할 수 있음.
	// 인스턴스 필드, 메소드가 되면 안됨.
	private SingleTon() { }	// 안됨.
	// 정적 멤버 필드
	// private 접근제한자는 자신만이 호출할 수 있음.
	private static SingleTon instance = new SingleTon();
	public static SingleTon getInstance() {
		return instance;
	}
	int x;
	int y;
}
