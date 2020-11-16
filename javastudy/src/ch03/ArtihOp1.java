package ch03;

/* 이항 연산자 : 항(피연산자)이 2
 * 산술 연산자 : +, -, *, /, %(나머지)
 * 	피연산자의 타입이 다를 수 있음.
 * 
 * */
public class ArtihOp1 {

	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 20;
		int i1 = b1 + s1; // 모두 다 int로 된다. (CPU)
		long l1 = 234L; // int와 구분하기 위해 'l'또는 'L' 써야함.
//		int i2 = i1 /* int -> long*/ + l1 /* long */; // 에러 (long)
		long l2 = i1 /* int -> long */ + l1 /* long */;
		float f1 = 2.34f; // double과 구분을 위해 'f' 또는 'F 써야함.
		double d1 = 40.32;
		double d2 = f1 /* float -> double */ * d1 /* double */;
		// 평균
		int avg1 = 171 /* int */ / 2 /* int */ ; /* int = int / int */
		System.out.println(avg1);
		double avg2 = 171 /* int */ / 2.0 /* int */ ; /* int = int / int */
		System.out.println(avg2);
		// 큰 타입으로 변환된다.
		// byte(1바이트) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
		// float가 long보다 크기는 작지만 값을 표현할 수 있는 크기가 더 크므로 수용할 수 있다.
		/*
		 * 실수는 오차가 발생할 수 있음. -> double이 float보다 더 정확하므로 실수는 double을 사용한다. (포현하는 비트 수가
		 * 많으므로)
		 */
		/* 정수는 int를 사용하되 더 큰 값이 요구될 때는 long을 사용 */
		// 나누기 : 어떤 수를 0으로 나누면 안됨. -> 무한대가 되고, 에러
//		System.out.println(4/0);	// ArithmeticException
		System.out.println("출력"); // 실행되지않음
		int a = get();

	}

	private static int get() {
		// 프로그램이 실행됨
		//
		//
		return 0;
	}

}
