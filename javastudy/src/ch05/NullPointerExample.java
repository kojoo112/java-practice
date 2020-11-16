package ch05;

public class NullPointerExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.length());
		if (str2 != null)
			System.out.println(str2.length());
		else
			System.out.println("str2가 null입니다.");

	}

	// callMethod가 실행되는 결과로 null이 반환될 수 있음.
	private static String callMethod() {
		// .....
		return null;
	}
}
