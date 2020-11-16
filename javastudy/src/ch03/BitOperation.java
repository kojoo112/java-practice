package ch03;

/*	비트 연산자 : 비트 단위로 연산을 수행
 *	~(NOT) &(AND) |(OR) ^(NOR) 
 *  int : 32비트
 *   						
 */

public class BitOperation {

	public static void main(String[] args) {
		// 양수 <-> 음수 : 2의 보수
		// 2의 보수 = 1의보수 + 1
		// 1의 보수 : 각 비트의 값을 0 -> 1, 1 -> 0
		// 00110101
		// 11001010 (1의 보수)
		byte b1 = 0b00110101;
		int num1 = ~b1;
//		byte b2 = ~b1;
		System.out.println(Integer.toBinaryString(num1));
		num1 += 1;
		System.out.println(num1);
	}

}
