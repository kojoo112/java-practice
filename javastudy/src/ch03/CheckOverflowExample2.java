package ch03;

public class CheckOverflowExample2 {

	public static void main(String[] args) {

		int num1 = 1000000;
		int num2 = 1000000;
		System.out.println(Integer.MAX_VALUE);
		int num3 = num1 * num2;
		System.out.println(num3);
		// 산술연산을 할 경우 overflow가 발생할 수 있음.
		// 똑같은 것을 다르게 한다.
		// 1. 직접 곱하기를 수행 : num3 = num1 * num2
		// 2. 메소드를 사용
		num3 = safeMultiple(num1, num2);

		if (num3 == 0) {
			System.out.println("너무 큰 값 입니다.");
		}

	}

	private static int safeMultiple(int num1, int num2) {
		long l = (long) num1 * num2;
		if (l > Integer.MAX_VALUE) {
//			곱하기를 skip
			return 0;
		} else {
			return num1 * num2;
		}

	}
}
