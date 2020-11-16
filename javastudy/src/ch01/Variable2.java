package ch01;

public class Variable2 {

	public static void main(String[] args) {
		int num1; // 변수만 선언 (지역 변수)
		num1 = 20; // 변수에 값을 저장 (선언과 저장을 달리 할 수 있다.)

		int num2 = 40; // 변수를 선언하고 동시에 값을 저장
		int num3 = 30; // 선언만 하면 쓰레기 값이 저장된다.
		int sum = num3 + 30; // num3에 어떤 값이 저장한 적이 없음
		// 결과를 예상할 수 없음 -> 에러 표시
		// 변수를 선언하고 어떤 연산을 하려면 값을 저장하여야 한다.
		// 지역변수는 선언과 값을 저장하는 순간에 존재한다.
		// 지역변수는 메소드가 종료되면 삭제됨
		System.out.println("합(sum) : " + sum);

	}

}
