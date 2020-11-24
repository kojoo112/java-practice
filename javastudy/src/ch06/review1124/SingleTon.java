package ch06.review1124;

/*
 * 싱글톤 : 객체가 한 개만 생성되어 사용
 * 	ex)시간을 다루는 객체(하나의 객체가 시간을 관리해야 함)
 * 	   데이터를 관리하는 객체
 * 1. 생성자를 private으로 만들어준다.
 * 	- 다른 객체가 싱글톤을 생성할 수 없도록 해준다. : private
 * 2. 싱글톤이 객체를 생성하고 정적필드에 저장
 * 3. 다른 객체가 싱글톤을 얻기 위한 Getter을 만들어 준다. : public
 */
public class SingleTon {
	// 2. 정적 필드
	private static SingleTon instance = new SingleTon();
	// 1. private : 자기 자신의 클래스내에서만 사용 가능
	private SingleTon() { } // default 생성자
	// 3. 다른 클래스가 싱글톤을 사용할 수 있도록 메소드를 제공
	public static SingleTon getInstance() {
		return instance;	
	}
	
	// 데이터를 공유
	int num;

}
