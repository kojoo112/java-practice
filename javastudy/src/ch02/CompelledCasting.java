package ch02;


/* 강제타입변환 : 큰 타입의 데이터를 작은 타입에 담을 때 
 * 프로그래머가 강제로 타입이 변환됨을 지정*/
public class CompelledCasting {

	public static void main(String[] args) {
		int i1 = 129;	// 4바이트
//		byte b1 = i1;	// 1바이트 <-4바이트
		
		int i2 = 123;	// i2는 127미만의 값만 사용한다.
//		byte b2 = i2;	// 에러 (설명이 부족함)
		byte b3 = (byte)i2;	// 32비트 중 마지막 (작은 수) 8비트만 저장
		// 1. 손실이 발생되지 않는 것을 알고 있을 때
		// 2. 손실이 발생하더라도 감수를 할 때
		
		int kor = 90;
		int eng = 85;
		int total = kor + eng;	// 175
		double avg = total / 2;	// 87.5
		System.out.println("평균: " + avg);
		
	}

}
