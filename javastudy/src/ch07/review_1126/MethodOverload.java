package ch07.review_1126;

// 자식이 부모의 메소드를 재정의할 수 있고
// 자식의 참조변수로 메소드를 호출하면
// 자식이 재정의한 메소드가 실행된다.
public class MethodOverload {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();	// 부모가 정의한 메소드
		child.method2();	// 부모, 자식 -> 규칙(자신이 재정의한 메소드가 실행)
							// (자식이 재정의한 메소드가 실행)
		child.method3();	// 자식이 정의한 메소드

	}

}

/*
 *  final : 마지막(최종)
 *  final int num = 10;	// 상수로 초기화 후에 변경 불가
 *   필드의 초기화 : class의 필드 선언시, 생성자로 초기화, static인 경우 static 블럭
 *  final class String { } 	// 상속 불가 : 다른클래스가 상속을 하지 못하도록 함
 *  final void method() { } // 상속은 가능하지만 메소드 재정의를 할 수 없다.
 *  ex) 설계자가 class, method, field 설계 후에 개발자에게 주면서 설계한대로 사용을 하도록 할 때
 *  
 *  접근제한자 : public, protected, default, private
 *  public : 제약이 없음. 어느 클래스든지 접근 가능
 *  protected : 상속받은 클래스는 public 처럼 동작 -> 허용
 *  	상속받지 않은 다른 패키지의 클래스는 default처럼 동작 -> 허용 안됨
 *  default : 같은 패키지내에서 허용
 *  private : 자신의 클래스내에서만 허용 -> 다른 클래스는 허용 안됨
 */
 