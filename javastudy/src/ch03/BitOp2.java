package ch03;

public class BitOp2 {

	public static void main(String[] args) {
		int value = 0x34567890;
		System.out.printf("value=%x\n\n", value);
		value = value & 0xFF000000;
		// value 0x34000000;
		value = value >> 24; // 오른쪽으로 쉬프트(비트이동)
		// value 0x00000034;
		System.out.printf("value=%x\n\n", value);

		// | (or) set 하고 싶을 때
		int value2 = 0x98463414; // 4 -> F
		System.out.printf("value2=%x\n\n", value2);
		value2 = value2 | 0x00F00000;
		System.out.printf("value2=%x\n\n", value2);

	}

}
