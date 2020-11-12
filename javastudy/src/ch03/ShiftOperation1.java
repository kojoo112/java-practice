package ch03;

public class ShiftOperation1 {

	public static void main(String[] args) {
		int num1 = 0x01234567;	//
		System.out.printf("num1=%08x\n", num1);
		int num2 = num1 >> 4;	// num1을 오른쪽으로 4비트 이동
		System.out.printf("num2=%08x\n", num2);	// 00123456
		// 왼쪽에서 들어오는 값(비트)은 부호비트가 들어온다. 부호비트 = 0
		
		int num3 = 0x81234567;	// 부호비트 1 : 100000010010
		System.out.printf("num1=%08x\n", num3);
		int num4 = num3 >> 4 ;	// num1을 오른쪽으로 4비트 이동
		System.out.printf("num2=%08x\n", num4);
	}

}
