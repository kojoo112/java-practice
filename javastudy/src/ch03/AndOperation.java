package ch03;

public class AndOperation {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 10;
		
		if(num1 > 10 && num2++ < 100) {	// 8 > 10거짓 (false) 10 < 100참 (true)
			//	 거짓	 && 참 = 거짓
			//	num1 > 10 거짓이면 num2 < 100을 비교하지않음
		}
		System.out.println("num1 = " + num1 +"\t" + "num2 = " + num2);
		// num1 = 8, num2 = 10;
		
		if(num1 > 10 & num2++ < 100) {}	// 8 > 10거짓 (false)
		// 거짓	&	참 = 거짓 
		// num1 > 10 거짓이지만 num2 < 100을 비교한다.
		System.out.println("num1 = " + num1 + "\t" + "num2 = " + num2);
		// num1 = 8, num2 = 11;
	}
		

}
