package ch06.static_initial;

public class SingletonExample {

	public static void main(String[] args) {
		// SingleTon의 생성자가 public 잡근제한자를 가질 경우 호출이 가능.
		// 접근제한자가 private일 경우는 다른 클래스에서 호출할 수 없음.
//		SingleTon s1 = new SingleTon();	// 객체1
//		SingleTon s2 = new SingleTon();	// 객체2
//		SingleTon s1 = SingleTon.instance;	// private이므로 접근 불가.
		SingleTon s2 = SingleTon.getInstance();	// 객체를 참조할 수 있음.
		s2.x = 30;	// SingleTon의 인스턴스 필드에 접근 할 수 있음.
		System.out.println("x = " + s2.x);	// 접근할 수 있음.
//		SingleTon.x = ;
		// SingleTon 객체에 접근할 수 있는 방법이 1개 뿐임.
		// 데이터 값을 고유하게 유지할 수 있음.
		

	}

}
