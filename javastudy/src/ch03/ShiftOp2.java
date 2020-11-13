package ch03;

public class ShiftOp2 {

	public static void main(String[] args) {
		
		int num1 = 0x12345678;
		System.out.printf("num1=%x\n", num1);
		int num2 = num1 << 4;	// 왼쪽으로 4비트 이동
		System.out.printf("num2=%x\n", num2);
		// 오른쪽으로 0이 들어온다.
		// 왼쪽으로 1비트 이동한다는 것은 2배로 곱해지는 효과가 있다.
		
		int num3 = 0x92345678;	//1001
		System.out.printf("num3=%x\n", num3);
		int num4 = num3 << 4;	// 왼쪽으로 4비트 이동
		System.out.printf("num4=%x\n", num4);
		// 오른쪽으로 0이 들어온다.
		// 왼쪽으로 1비트 이동한다는 것은 2배로 곱해지는 효과가 있다.
		
		int num5 = 0x81234567;	//1001
		System.out.printf("num5=%08x\n", num5);
		int num6 = num5 >>> 4;	// 왼쪽으로 4비트 이동
		System.out.printf("num6=%08x\n", num6);
		// 오른쪽으로 0이 들어온다.
		// 왼쪽으로 1비트 이동한다는 것은 2배로 곱해지는 효과가 있다.
		
		

	}

}
