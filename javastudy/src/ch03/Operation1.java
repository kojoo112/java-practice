package ch03;

public class Operation1 {

	public static void main(String[] args) {
		// 산술 연산자 +, -, *, /, % (나머지)

		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2; // 산술 연산자
		int val2 = num1 - num2;
		int val3 = num1 * num2;
		int val4 = num1 / num2;
		int val5 = num1 % num2;

		System.out.println("sum = " + sum);

		// 부호 연산자 : +,-
		int val6 = +num1; // 부호 +
		int num3 = -10;
		int val7 = -num3; // 부호 -
		// (-1) * num3

		// 문자열 + : 문자열을 더해준다.
		System.out.println("val7 = " + val7); // + 사용됨
		// "val7 = 10"

		// 대입 연산자 : =
		int val8 = 20; // 오른쪽의 연산의 결과를 왼쪽의 변수에 저장
		val8 = num3 + 40;
		val8 += 3;
		val8 = val8 * 3;
		val8 *= 3; // 위와 같다
		System.out.println("val8= " + val8);

		// 증감 연산자 : ++, --
		int val9 = 10;
		System.out.println("val9++= " + val9++); // 10 : 증가가 대입보다 나중에 일어남
		System.out.println("val9= " + val9); // 11
		System.out.println("++val9= " + ++val9); // 12 : 증가가 먼저 이뤄짐
		System.out.println("val9= " + val9); // 12

		System.out.println("val9--= " + val9--); // 12
		System.out.println("val9= " + val9); // 11
		System.out.println("--val9= " + --val9); // 10
		System.out.println("val9= " + val9); // 10

		// 비교 연산자 : 이항이 필요(==같으냐, !=같지않느냐?, > 크냐?, < 작냐?)
		//
		System.out.println(val9 > 10);

		// 논리 연산자 : &&(and : 동시에 만족), ||(or : 한가지만 만족)
		/*
		 * A(true 또는 false) && B(true 또는 false) T T = true T F = false F T = false F F =
		 * false
		 */

		/*
		 * A || B T T : T T F : T F T : T F F : F*
		 */
		// A && B

		// &&, & 기능은 동일
	}

}
