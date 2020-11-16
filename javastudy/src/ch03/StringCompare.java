package ch03;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = "홍길동"; //
		String str2 = "홍길동"; // 위에 있는 홍길동과 같은 주소를 가진다.
		String str3 = new String("홍길동");

		if (str1 == str2) {
			System.out.println("같은 주소값을 가진다. " + "동일한 문자열이다.\n");
		} else {
			System.out.println("다른 주소를 가진다.\n");
		}

		if (str1 == str3) {
			System.out.println("같은 주소값을 가진다." + "동일한 문자열이다.\n");
		} else {
			System.out.println("다른 주소를 가진다.\n");
		}

	}

}
