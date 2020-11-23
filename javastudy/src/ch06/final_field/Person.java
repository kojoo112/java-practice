package ch06.final_field;

/*
 * final : 최종(마지막) -> 변경할 수 없음 -> 상수 취급
 * 초기값을 한 번 지정을 해주어야 함.
 * 1. 필드 선언 시
 * 2. 생성자 호출 시
 * 처음에 한번을 넣어 주어야 그 다음에 변경하지 않아도 됨
 */

public class Person {
	// 상수 : static(객체 생성과 관계없이) final(변경 불가)
	// 대문자, 단어 연결시_사용
	// public : 다른 클래스, 다른 패키지에서 접근 가능
	public static final int MAXIMUM_AGE = 200;
	// private : 자기자신만 사용 가능
	private static final int MINIMUM_AGE = 0;
	public static final int TEENAGER = 10;
	public static final int LOW_LIMIT = 0;
	public static final int HIGH_LIMIT = 9;
	public static final int MAXIMUM_TEENAGER;
	public static final int MINIMUM_TEENAGER;
	
	// 두 개의 상수를 조합해서 새로운 상수를 만들 때
	// static을 사용할 수 있다.
	static {
		MAXIMUM_TEENAGER = TEENAGER + LOW_LIMIT;
		MINIMUM_TEENAGER = TEENAGER + HIGH_LIMIT;
	}
	
	final String nation = "Korea";	// 국적
	final String ssn;				// 주민등록번호
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;		// final을 초기화
		this.name = name;
	}
	public void method() {
//		ssn = "20010101 - 2008763";	// 수정불가 : final이므로
		// final은 한번 초기화되면 수정 불가.
	}
}
