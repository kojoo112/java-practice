package ch07.final_class;

public class Child extends Parent {
	// 부모의 메소드
	@Override
	public void method1() {
		super.method1();
	}
	
	// 에러 : method2 : Parent class에서 final
	// 부모 클래스의 final 메소드는 재정의할 수 없음.
//	public void method2() {
		
	
	
	// 자식이 새롭게 정의한 메소드
	public void method3() {
//		num = 20;	// 변경 불가능
		// 이클립스가 에러를 수정하도록 가이드를 해준다고 해서
		// 무조건 변경을 하지말고 어떻게 해야 하는지 결정을 한 후 실행을 한다.
	}
}
