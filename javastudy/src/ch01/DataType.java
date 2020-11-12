package ch01;

/*	데이터 유형
 * 	정수형 : 정수 -> default int (32 bit)
 * 	-byte : 1바이트(8 bit) 0~127, -1 ~ -128
 * 	-char : 2바이트(16 bit) 문자 저장 -> 양수만 존재(0~65535)
 * 		'A', '가' : '\u0000' ~ '\uffff' (u: uni code)
 * 	-short : 2바이트(16 bit) -2^15 ~ 2^15 -1
 * 	-int : 4바이트(32 bit) -2^31 ~ 2^31 -1
 * 	-long : 8바이트(64 bit) -2^63 ~ 2^63 -1 (64=64-1)
 * 
 *	 실수형 : 소수점이 있는 소수 -> default double (64 bit)
 *	- float : 4바이트(32 bit) -xxx ~ yyy
 *	- double : 8바이트(64 bit) -zzz ~ www
 *	  논리형 : true or false
 *	- boolean : 1바이트
 */

public class DataType {

	public static void main(String[] args) {
		// 정수형
		byte b1 = 10;
		char c1 = 'a';
		short s1 = 128;
		int i1 = 245;
		long l1 = 324L; // long에는 int와 구별하기 위해 'L' 또는 'l'을 사용
		long l2 = 76300l;
		
		// 실수형
		float f1 = 23.5f;	// double과 구분하기 위해 'F' 또는 'f'을 사용
		float f2 = 8E7f;
		double d1 = 3.32E-34;
		double d2 = 3.14159265;
		
		// 논리형
		boolean flag = true;
		boolean flag2 = false;
	}

	
}
