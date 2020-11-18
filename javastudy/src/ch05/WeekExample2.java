package ch05;

public class WeekExample2 {

	public static void main(String[] args) {
		
		Week now = Week.WEDNESDAY;
		// enum Week는 java.lang.Enum 클래스를 상속받음
		// enum 클래스가 가지고 있는 메소드 사용가능
		System.out.println(now.name());		// 값을 출
		System.out.println(now.ordinal());	// 순서를 출력
		Week values[] = now.values();
		// values() : enum Week 가지는 모든 값을 반환
		for(Week w : values) { // 반복 출력 
			System.out.println(w.name());
		}
		
	}

}
