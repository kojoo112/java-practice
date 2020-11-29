package ch07.inheritance_class;

// 상속 : extends 키워드를 사용하고 부모 클래스를 지정
// 자바에서는 부모클래스를 한 개만 사용할 수 있음
// C++ 에서는 여러 개의 부모 클래스를 상속 가능
public class Child extends Parent {
	// 필드
	int field3;;
	
	// 생성자
	public Child() { 	// 자식 생성자
		//super();	// 부모 생성자를 호출
		// default로 컴파일러가 알아서 해주므로 생략 가능
		
		
	}
	public Child(int value) {
		// super(); 부모 생성자를 호출하는게 생략된 것 임.
		this.field3 = value;
	}
	
	// 메소드
	public void method3() {
		System.out.println("method3()");
	}
	
}
