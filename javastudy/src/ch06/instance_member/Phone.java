package ch06.instance_member;

/* 클래스의 구성원 :
 * 		인스턴스 멤버, 정적멤버
 * 인스턴스 멤버 : 객체를 생성해서 사용할 때 의미가 있음
 * 		회원가입 : 한 명의 회원이 가입을 하면 회원 데이터를 저장
 * 		-> 객체를 생성(저장공간을 확보) : 인스턴스화
 * 정적 멤버 : 클래스의 공통 데이터, 공통 메소드
 * 		객체마다 존재하지 않음
 * 		객체를 생성하지 않고 클래스 이름으로 접근을 할 수 있음.
 * 		AS 보장기간 : 1년 (회사가 정한 값) -> 모든 휴대폰에 동일
 *		휴대폰 사용자마다 다른 값이 아니라 공통 
 */

public class Phone {	
	// 필드
	// 인스턴스 필드
	public String owner;		// 인스턴스 필드
	public String model;		// 인스턴스 필드
	public String number;		// 휴대폰 번호 (인스턴스 필드)
	// 정적 필드
	public static int asPeriod;	// 정적 필드(1년)
	
	// 메소드 : 인스턴스 메소드
	public void setNumber(String msn) {
		number = msn;
	}
	
	// 정적 메소드
	public static void setAsPeriod(int period) {
		asPeriod = period;
	}
	
}
