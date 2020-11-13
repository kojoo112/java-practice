package ch04;

public class IfCond {

	public static void main(String[] args) {
		int num2 = 30;
		if(num2 > 10) {	// 조건을 만족하고 실행문이 1줄일 때
						// '{', '}' 생략 가능
			System.out.println("10보다 크다.");
		}else {
			System.out.println("10보다 작다.");
		}
	
	// 입력을 받고
	
	String gender = "남자";
	int age = 30; 
	if(gender.equals("남자")) {
		// 세부분류
		if(age < 10) {
			System.out.println("10살 미만의 남자");
		} 
		else if (age < 20){
			System.out.println("20살 미만의 남자");
		}	else if(age < 30) {
			System.out.println("30살 미만의 남자");
		}	else {
			System.out.println("여자");
		}
	}

		if(gender.equals("남자") && age < 10) {
			System.out.println("10살 미만의 남자");
		}else if (age < 20){
			System.out.println("20살 미만의 남자");
		}	else if(age < 30) {
			System.out.println("30살 미만의 남자");
		}	else {
			System.out.println("여자");
		}
	
	}
}