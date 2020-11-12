package ch01;

public class ByteAdd {

	public static void main(String[] args) {
		byte b1 = 4;
		byte b2 = 5;
//		byte b3 = b1 + b2; // 에러 (9)
		// b1 + b2 : int(32 bit) -> 8bit에 넣으려면 에러
		
		byte b7 = (byte)(b1+b2);	// 앞에 있는 24비트는 못 넣는다.
			// 앞에 있는 24비트를 안넣어도 관계없음
		
		byte b4 = 126;
		byte b5 = 125;
//		byte b6 = b4 + b5;	// 251 (바이트로 표현할 수 없음)
		// b4 + b5의 결과는 CPU의 레지스터에 저장되고, 레지스터는 32비트다.
		byte b8 = (byte)(b4+b5);	// 손실이 발생한다
		System.out.println("b8: " + b8 + "b4 + b5=" + (b4 + b5));
		// 결론적으로 byte + byte = int
	}

}
