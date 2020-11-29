package ch07.inheritance_class;

public class Parent {
	
	// 필드
	int field1;
	String field2;
	
	// 생성자
	public Parent() { }
	public Parent(int value) {
		field1 = value;
	}
	
	// 메소드
	public void method1() {
		System.out.println("method1()");
	}

	public void method2() {
		System.out.println("method2()");
	}

}
