package ch07.polymorphism;

public class AccessScopeExample {

	public static void main(String[] args) {
		// 자동 타입변환
		Parent parent = new Child();
		parent.field1 = 20;	// Parent가 정의한 필드
//		parent.field2 = 30; // 에러(규칙) : Child 정의한 필드
		// 규칙 : Parent 타입은 parent 클래스 밖에 안보인다.
		parent.method1();	// Parent가 정의한 메소드
		parent.method2();	// Child가 재정의한 메소드
			// 부모가 정의한 메소드가 실행되지 않고 자식 재정의한 메소드
//		parent.method3();	// Child가 정의한 메소
//		Child child = parent;	// Child = Parent : 에러
		Child child2 = (Child)parent;	// 강제타입변환을 할 수 없다.
			// 원래 parent타입에 대한 객체가 Child이므로
		child2.field2 = 30;		// 허용(자신의 필드)
		child2.method3();		// 허용(자신이 정의한 메소드)
		// 부모 객체 생성
		Parent p2 = new Parent();
		p2.field1 = 40;	// Parent가 정의한 필드
		p2.method1();	// Parent가 정의한 메소드
		p2.method2();	// Parent가 정의한 메소드 (생성됨)
		Child c3 = (Child)p2;	// 강제타입변환 -> 에러를 감수
		c3.field1 = 30;
		c3.field2 = 40;
		c3.method1();
		c3.method2();
		c3.method3();
		long l1 = 324l;
		
	}

}
