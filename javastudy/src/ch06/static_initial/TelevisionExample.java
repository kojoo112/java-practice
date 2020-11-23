package ch06.static_initial;

public class TelevisionExample {

	public static void main(String[] args) {
		// TelevisionExample 클래스의 maiin()가 실행되면
		// Television 클래스의 필드 info를 출력하려는 순간에
		// Television 클래스가 메모리역역 로딩이 된다.
		System.out.println("info = " + Television.info);
	}

}
