package ch07.method_override;

public class Child extends Parent {
	@Override
	public void method2() {
//		super.method2();	// super : Parent (부모 클래스)
		System.out.println("Child:method2()");
	}
	// 메소드를 수정하지 않으면 부모의 메소드가 실행됨
	
	// 메소드 override : 부모의 메소드를 자식이 다시 정의함
	public void mehtod3() {
		System.out.println("method3()");
	}
}
