package ch05;

/* 참조변수 : Reference Variable
 * 어떤 객체나 배열에 대한 주소를 저장하는 변수
 * 객체에 접근하려면 참조변수를 통해서 접근할 수 있다.
 * array (배열)
 * enum (Enumeration 열)
 * class (클래스)
 * interface에 대한 주소를 저장
 */

public class ReferenceVariable {

	public static void main(String[] args) {
		String name = "홍길동";
		String nickname = "바람의 아들";
		// 참조변수 : name, nickname -> stack영역에 저장
		// "홍길동", "바람의 아들" : 문자열 리터럴 -> 힙영역에 저장
		System.out.println(name);
		name = nickname;
		System.out.println(name);
		// "홍길동"을 접근할 수 있는 방법이 없음
		// 쓰레기가 된다. -> 가비지 컬렉터가 회수 -> 다른 사용자에게 할당
		// 바로 할당하지는 않고 메모리가 부족할 때 할당
		String str2 = "바람의 아들"; // 위에 있는 "바람의 아들"과 동일
		System.out.println(nickname == str2);
		String str3 = new String("바람의 아들");
		System.out.println(str2 == str3);
		// == 주소를 비교
		// 내용을 비교하려면, equals 메소드를 사용
		System.out.println(str2.equals(str3));

	}

}
