package ch06.getter_setter;

/*
 * 연산을 실행하거나 설정을 할 때 잘못 설정
 * speed = -10;
 */

public class Car {
	// 필드
	// private : 자기자신 외에는 접근을 허용하지 않음
	// 보통 클래스에서 필드를 선언할 때 private 접근제한자를 사용
	private int speed;
	private boolean stop;
	
	// 메소드
	// public : 아무나 접근 할 수 있음
	// setter : 값을 저장하는 메소드 set단어의 대문자로 시작하는 단어
	public void setSpeed(int s) {
		if(s < 0) {
			System.out.println("잘못된 값이 설정됨");
			speed = 0;
		} else {
			speed = s;
		}
	}
	
	// Getter : 값을 얻는 메소드
	public int getSpeed() {
		return speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	// 이클립스에서는 getter와 setter을 만드는 방법 제공.
}
