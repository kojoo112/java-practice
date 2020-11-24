package ch06.access_modifier_other;

import ch06.access_modifier.ClassA;

/* ClassE : ClassA와 다른 패키지에 있는 클래스(*ClassA을 상속받음 (extends))
 *  - public, protected 접근 가능
 */

public class ClassE extends ClassA {	// ClassA을 상속받음

	// 정적 메소드는 정적 필드만 사용 가능
	public static void main(String[] args) {
	}

	public void method() {
		// 필드
		pub1 = 10;	// public : O
		prot1 = "홍";	// protected : O
//		def1 = 20;	// default : X -> 패키지가 다르므로 안됨.
//		pri1 = 30;	// private : X
		
		// 메소드
		method1();	// public : O
		method2();	// protected : O
//		method3();	// default : X
//		method4();	// private : X
	}
}
