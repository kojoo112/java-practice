package ch07.review_1126;

/*
 *  메소드 재정의 : 부모와 자식의 상속관계에서 자식이 뿌모의 메소드를 재정의
 *  자식이 부모의 메소드를 상속받았지만 자식만의 메소드를 재정의 해서 사용하겠다.
 *  재정의 : 메소드이름과 매개변수(타입, 갯수, 순서), 반환형이 같아야 한다 : signature
 */
public class Parent {

	void method1() {
		System.out.println("Parent : method1()");
	}
	
	 void method2() {
		System.out.println("Parent : method2()");
	}

}
