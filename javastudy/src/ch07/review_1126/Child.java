package ch07.review_1126;

public class Child extends Parent {

	// Parent 클래스의 메소드를 사용할 수 있다.
	// 자식의 메소드를 정의
	
	void method3() {
		System.out.println("Child : method3()");
	}
	
	// 메소드 재정의 : 나만의 방식으로 동작을 재정의 한다.
	@Override	//annotation을 사용해서 컴파일러에게 
	void method2() {
		System.out.println("Child : method2()");
		super.method2();
	}
}
