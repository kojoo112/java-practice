package ch06.static_initial;

public class Television {
	// 정적 멤버 필드
	static String company = "Samsung";	// 1
	static String model = "LED";		// 2
	static String info;	// null
	// 인스턴스 멤버 필드
	int size;	// 인치 수
	int width;	// 너비
	int height;	// 높이
	
	static {	// 정적 블럭 : 클래스가 메소드 영역에 로딩될 때 실행
		// 위에 있는 static 멤버 필드를 사용해서 초기화
		info = company + " : " + model;	// 3
//		size = 50;	// 에러 : static 객체의 생성과는 무관
			// 객체가 생성되어야 존재
	}
}
