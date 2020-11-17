package ch05;

public class ArrayInitial {
	
	public static void main(String[] args) {
		
		int a = 5; // 쓰레기가 들어있음 -> stack
		int b = a + 10;	// 초기화를 하지 않으면 사용 불가
		// heap 영역에 생성됨 -> new 연산자를 사용해서 생성을 하면 0으로 출력됨
		int num[] = new int[5];	// 초기값이 0
		// 배열에 들어있는 값을 출력
		for(int i = 0; i <5; i++) {
			System.out.println("num[ " + i + " ] = " + num[i]);
		}
		// 의미있는 값을 넣어서 사용
		num[0] = 10;
		
		String strArr[] = new String[5];	// String 객체
		for(int i = 0 ; i < strArr.length; i++ ) {
			// strArr.length : 5
			// 배열 객체는 배열의 길이를 내부에 가지고 있음.
			System.out.println("String[ " + i + " ] = " + strArr[i]);
		}
		strArr[0] = "홍길동";	//
		strArr[1] = "임꺽정";
	}

}
