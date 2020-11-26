package ch07.polymorphism;

public class Child extends Parent {

	// 필드
	int field2;
	
	// 메소드 정의
	void method3() {
		System.out.println("Child : method3()");
	}
	
	// 재정의
	@Override
	void method2() {
		System.out.println("Child : method2()");
	}
}
