package ch03;

/*
 * 단항 연산자 : 피연산자가 1개
 *  - 부 연산자 (+, -)
 *    + - 부호 : -1 을 곱한 것과 같다. (부호가 변경 된다.)
 *    + -> -
 *    - -> +
 *  - int : 
 *  - 증감 연산자 : ++(1증가), --(1감소)
 *  
 *  
 * */

public class SignOperation {

	public static void main(String[] args) {
	
		short s1 = 20;
		short s2 = (short) -s1; // 에러 : CPU, 메모 -> (short)를 써야한다.
		// int, long이 아닌 byte, short는 - 부호를 붙이면 int 가 된다.
		
		int num1 = 20;
		int num2 = num1++;	// ++가 변수 뒤에 있을 때는 먼저 대입이 이루어 지고 
							// 나중에 증가가 된다. (num2 = 20)
		System.out.println("num1 = " + num1);	// num1 = 21
		int num3 = ++num2;	// 증가가 먼저 이루어진 후 대입이 된다.
		System.out.println("num3 = "+ num3 + "\t"+"num2 = " + num2); 	// 둘 다 21이 된다.
		// num--
		// --num
		
		// 논리부정 연산자 : !
		boolean flag = true;
		if(!flag) {	// !flag = false	
					// 조건문에서는 조건을 만족하면 실행문을 실행한다.
			
		}			// !flag : false인지를 검사
		
		//	비트반전 연산자 : ~ (tilt) : 1의 보수
		// 각 비트를 0 -> 1, 1 -> 0으로 변
		byte b3 = 2;
//		byte b4 = ~b3;	// int -> CPU에서 동작하 것은 무조건 int
		int num4 = ~b3;	//
		
	}

}
