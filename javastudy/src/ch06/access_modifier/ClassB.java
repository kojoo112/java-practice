package ch06.access_modifier;

/* ClassB : ClassA와 같은 패키지에 있는 다른 클래스
 * ClassA을 사용할 때 어떤 제한이 있는가?
 *  - private만 안된다.
 */
public class ClassB {

	public static void main(String[] args) {
		// class : public 클래스 : 허용 O
		ClassC cc =  new ClassC();	// default : 허용 O
		
		// 생성자 사용
		ClassA c1 = new ClassA();	// public : 허용 O
//		ClassA c2 = new ClassA(10);	// private : 허용 X
		ClassA c3 = new ClassA("홍길동");	// protected : 허용 O
		ClassA c4 = new ClassA(10, "홍");	// default : 허용 O
		
		// 필드 사용
		c1.pub1 = 20;	// public : 허용 O
		c1.prot1 = "홍";	// protected : 허용 O
		c1.def1 = 30;	// default : 허용 O
//		c1.pri1 = 40;	// private : 허용 X
		
		// 메소드
		c1.method1();	// public : 허용 O
		c1.method2();	// protected : 허용 O
		c1.method3();	// default : 허용 O
//		c1.method4();	// private : 허용 X
	}

}
