package ch05;

public class StringTwod {

	public static void main(String[] args) {
		String strArr[] = new String[3];
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr [ " + i + " ] = " + strArr[i]);

		}
		strArr[0] = new String("홍길동");
		// 새로 데이터를 저장할 String 객체를 생성
		strArr[1] = new String("빛나리");
		strArr[2] = new String("임영웅님");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr [ " + i + " ] = " + strArr[i]);

		}
		Member member [] = new Member[3];	// 참조변수 배열
		member[0] = new Member("kdhong", "홍길동", "1111");
		member[1] = new Member("cskim", "김철수", "1111");
		member[2] = new Member("shlee", "이순희", "1111");
	}
}