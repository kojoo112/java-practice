package ch07.method_override;

public class InheritanceExample {

	public static void main(String[] args) {
		Child child = new Child();
		// 부모의 메소드, 자식의 메소드도 가짐
		child.method1();	// Parent의 메소드
		child.method2();	// 부모, 자식(재정의) 규칙 : 자식이 재정의한 메소드를 실행
		child.mehtod3();	// 자식의 메소드
		Parent parent = (Parent)child;
		parent.method2();
	}

}
