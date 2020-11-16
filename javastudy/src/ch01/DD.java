package ch01;

public class DD {
	public static void main(String[] args) {
		float f1 = 9.1234567f;
		int i = Float.floatToIntBits(f1);
		System.out.printf("%f\n", f1);
		System.out.printf("0%s\n", Integer.toBinaryString(i));
		float f2 = -9.1234567f;
		int j = Float.floatToIntBits(f2);
		System.out.printf("%f\n", f2);
		System.out.printf("%32s\n", Integer.toBinaryString(j));
	}

}
