package ch03;

/*
 * 문자열 연결 연산자 : + -> 연
 * "문자열" + "문자열" : "문자열문자열"
 * 문자열 + 숫자 ( -> 문자열로 자동타입변환이 이루어진다. )
 * 
 * */
public class CharCon {

	public static void main(String[] args) {
	
		String str1 = "java" + 8;	// "Java" + "8"
		System.out.println(str1);	// "Java8"
		String str2 = "Oracle" + 4 + 5; // Oracle45
		System.out.println(str2);
		String str3 = "Oracle" + (4 + 5);	//Oracle9
		System.out.println(str3);
		String str4 = 4 + 5 + "apple";	// 9apple
		System.out.println(str4);

	}

}
