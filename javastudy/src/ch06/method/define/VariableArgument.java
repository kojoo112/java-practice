package ch06.method.define;

public class VariableArgument {

	public static void main(String[] args) {
		// 매개변수의 수를 가변으로 하는 방법
		/* 방법1 : 배열을 사용
		 * 방법2 : '...' 사용
		 * 
		 * 
		 */
		// 더하기 예를 사용
		int data1[] = { 1, 2, 3, 4 };
		int total1 = sum1(data1);
		System.out.println("합 = " + total1);
		System.out.println("합 = " + sum1(new int[] { 1, 2, 3, 4, 5, 6, 7, }));
		
		// 방법2 : ...
		// 방법 1은 메소드를 호출하기 전에 배열을 선언해야 한다.
		// 방법 2는 배열의 선언 없이 가변으로 전달할 수 있음. -> 좋다.
		System.out.println("합 = " + sum2(1, 2, 3));
		System.out.println("합 = " + sum2(1, 2, 3, 4, 5, 6));
	}
	
	// 메소드 정의 : 가변매개수를 지원하기 위하여 '...' 사용
	public static int sum2(int ... num) {
		// num : 배열로 동작
		// 배열의 항목 : num[0], num[1], num[2]
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
	}
	
	// 메소드를 정의 : sum1
	public static int sum1(int[] num) {
		int total = 0;	// 합을 저장하는 변수
		//1 + 2 + 3 + 4 : 반복문 +를 반복
		for(int i = 0; i < num.length; i++) {
			// num.length : 4
			// i : 0, 1 , 2, 3
			total += num[i];
		}
		return total;
	}

}
