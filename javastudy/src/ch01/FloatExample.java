package ch01;

// 컴퓨터에서 소수가 저장되는 형태를 보기 좋게 출력해보는 프로그램
public class FloatExample {

	public static void main(String[] args) {
		float f1 = 9.1234567f;  // double과 float를 구별하기위해 'f'를 써줘야함
		int i = Float.floatToIntBits(f1);	//이진수 형태를 출력하기 위해 변환
		System.out.printf("%f\n" /* 서식 */, f1); 	//서식에 따라 출력
		System.out.printf("%32s\n", Integer.toBinaryString(i));
		//println 	: 자동으로 줄을 바꾸어 준다.
		//print		: 줄바꾸기 없음 ->데이터를 입력받을 때
		//printf	: 서식을 사용해서 출력할 때 사용 ->
		
		float f2 = -9.1234567f;
		int j = Float.floatToIntBits(f2);
		System.out.printf("%f\n" /* 서식 */, f2); 	//서식에 따라 출력
		System.out.printf("%32s\n", Integer.toBinaryString(j));
		// 서식 : %d(정수), %c(문자), %e(실수), %g(실수), %o(8진수), %x(16진수)
		
	}

}
