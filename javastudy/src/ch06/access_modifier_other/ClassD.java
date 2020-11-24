package ch06.access_modifier_other;

import ch06.access_modifier.ClassA;

/* ClassD : ClassA와 다른 패키지 경로에 있는 클래스
 * - public만 됨
 */

public class ClassD {

	public static void main(String[] args) {
		// class에 접근
		ClassA c1 = new ClassA();	// public : import 해주면 됨
//		ClassC c2 = new ClassC();	// default : 아예 안보임
		// 다른 패키지에 있는 default 접근제한자를 가지는 class은 접근불가
		
		// 생성자
		ClassA c3 = new ClassA();	// public : 허용 O
//		ClassA c4 = new ClassA(10);	// private : 허용 X
//		ClassA c5 = new ClassA("홍길동");	// protected : 허용 X
//		ClassA c6 = new ClassA(10, "홍");	// default : 허용 X
		
		// 메소드
		c1.method1();	// public : 허용 O
//		c1.method2();	// protected : 허용 X
//		c1.method3();	// default : 허용 X
//		c1.method4();	// private : 허용 X
	}

}
