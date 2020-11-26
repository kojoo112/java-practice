package ch07.polymorphism;


/* 다형성 : 상속관계 또는 (interface - 구현객체)의 관계에서 성립
 * 다형성의 전제조건 : 1.부모클래스에 자식클래스를 대입할 수 있다.
 * Tire 클래스 : 부모
 * HankookTire : Tire클래스를 상속받은 자식클래스
 * Tire leftfrontTire = new HankookTire();
 * 부모 클래스 = 자식 클래스
 * 2. 부모클래스를 상속받은 자식클래스는 부모의 메소드를 재정의한다.
 * 큰 타입 데이터 = 작은 타입 데이터
 * long l1 = 10; // int : 자동타입변환이 이루어진다.
 * 
 */
public class Tire {
	// 필드
	public int maxRotation;	// 최대 회전 수
	public int accumulatedRotation;	// 누적 회전 수


	// 메소드

	
}