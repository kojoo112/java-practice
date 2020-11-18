package ch05;

import java.util.Calendar;

/*
 * Enum : 한정된 범위의 값들을 가지는 것을 대상으로 한다.
 * enum type으로 정의를 해서 사용
 * 월요일, 화요일, 수요일, ...
 * 컴퓨터에서는 1, 2, 3, 4 같은 숫자로 저장되어 있음.
 * 숫자로 저장되어 있으면 바로 월요일이라는 것을 연상하기가 어려움
 * Enum 타입을 사용하면 프로그램을 좀 더 쉽게 이해할 수 있다.
 * 
 */
public class WeekExample {

	public static void main(String[] args) {
		// today : 참조변수 -> stack
		Week today = Week.WEDNESDAY;	// 프로그램 영역
		if(today == Week.WEDNESDAY) {
			System.out.println("자바 공부를 합니다.");
		} else if(today == Week.THURSDAY) {
			System.out.println("헬스를 합니다.");
		}
		
		Calendar now = Calendar.getInstance();	// 시간정보를 알 수 있는 Calendar 객체를 가져온다.
		int week = now.get(Calendar.DAY_OF_WEEK);	// 오늘이 무슨 요일인지 알려
		System.out.println(week);
		// 일 : 1, 월 : 2, 화 : 3, 수 : 4
		
		if(week == 1) {
			System.out.println("일요일");
		} else if(week == 2) {
			System.out.println("월요일");
		}
		int year = now.get(Calendar.YEAR);	// 2020
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		System.out.println(year + "년 " + (month+1) + "월 " + date + "일");
	}

}
