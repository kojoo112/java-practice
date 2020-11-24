package ch06.review1124;

/*	인스턴스멤버, 정적멤버
 * 	인스턴스멤버 : 객체를 생성한 후 사용. 참조변수를 통해서 접근
 * 	정적 멤버 : 객체의 생성없이 클래스이름으로 접근(사용)할 수 있음
 * 	 static 키워드가 붙음. 클래스가 로딩될 때 메소드 영역에 존재.
 */

public class ReviewExample {
	// 인스턴스 필드
	int field1; 
	String field2;
	
	// 정적 필드 : static 키워드를 사용
	static int field3;
	static String field4;

	// 정적 메소드 : static 키워드를 사용
	public static void main(String[] args) {
		// 객체의 생성과는 무관하게 사용
		// field1은 객체가 생성 (new 연산자 + 생성자) 되어야만		
//		field1 = 20;	// 에러 발생
		// 정적 필드만 사용 가능 : 객체의 생성과는 무관하므로
		// 객체를 생성하지 않고 클래스 이름을 사용해서 접근
		field3 = 30;	// 공용 데이터 : 모든 객체가 공통으로 사용
		System.out.println("field3 = " + field3);
		ReviewExample re = new ReviewExample();
		re.field1 = 40;	// 인스턴스 필드는 객체를 생성한 후 참조변수로 접근
		// 특정한 객체에 속한다.
		re.field3 = 50;	// 정적 필드를 특정 객체가 접근을 할 수도 있지만
		// 정적 필드는 공통데이터이므로 클래스 이름으로 접근
		ReviewExample.field3 = 50;	// 다른 클래스 일 때
		final int const1 = 30;	// final : 상수
//		const1 = 40;			// final : 초기화 이후에는 변경 불가
		
	}
	// 인스턴스 메소드 : 객체가 생성된 후 참조변수를 통해서 실행된다.
	public void method1() {
		System.out.println("method1()이 실행됨");
		field1 = 20;	// 인스턴스 필드를 사용 가능 : field1이 이미 생성됨
		field4 = "홍길동";	// 정적 필드
	}

}
