package ch03;

public class BitOp2 {

	public static void main(String[] args) {
		int value =		0x34567890;
		System.out.printf("value=%x\n\n",value);
		value = value & 0xFF000000;
		// value 		0x34000000;
		value = value >> 24 ;	// 오른쪽으로 쉬프트(비트이동)
		// value		0x00000034;
		System.out.printf("value=%x\n\n",value);

	}

}
