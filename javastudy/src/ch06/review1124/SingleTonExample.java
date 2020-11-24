package ch06.review1124;

import java.util.Calendar;
import java.util.Date;

public class SingleTonExample {

	public static void main(String[] args) {
		SingleTon s = SingleTon.getInstance();
		s.num = 20;
		System.out.println("num = " + s.num);
		
		// 싱글톤을 사용한 예
		Calendar now = Calendar.getInstance();
		now.set(2030, 10 ,24);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		System.out.println(year + "년 " + (month+1) + "월 " + date + "일 ");
		// Date 클래스가 여러개의 패키지에 존재함 -> 어느 것을 사용하는지 패키지 경로를 알아야 함.
		Date today = new Date();
		System.out.println(today);
	}

}
