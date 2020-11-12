package ch02;

/*	타입변환 : 데이터 타입의 변환이 이루어지는 것
 *   자동 타입변환 : 프로그램이 자동으로 변환
 *   강제 타입변환 : 프로그래머가 수동으로 변환
 */



public class AutoCasting {

	public static void main(String[] args) {
		char a  ='a';	// 2바이트 16비트
		int i1 = a;		// 4바이트이고 2바이트인 char a를 담을 수 있다.
			// 자동 타입변환
		byte b1 = 10;	// 1바이트
		int i2 = b1;	// 4바이트
		
		short s1 = 235;
		int i3 = s1;
		
		long l1 = i3;	// long(8)에 int(4)를 저장
		float f1 = i3;	// float(4)에 int(4)를 저장
		double d1 = f1; // double(8)에 float(4)를 저장
		
		int num1 = 10;
		double num2 = 20;
		
		// 다른타입의 operand(연산자)간에 연산시에는 자동으로 큰 타입으로 전환
		// double = int(double로 자동 형변환됨) + double
		double sum = num1 + num2;	
	}

}
