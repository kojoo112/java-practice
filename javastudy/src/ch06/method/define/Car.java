package ch06.method.define;

public class Car {
	// 필드
	int seatNum;
	int speed;
	String model;
	int gas;	// 가솔린
	Handle handle;
	Tire tire;
	// 메소드 : 동작이나 기능
	
	/* 사람을 싣는다.
	 * 운행을 한다. -> 연료가 소비, 
	 * 속도를 변경. (변경값이 주어져야)
	 * 방향을 변경한다. : 왼쪽, 오른쪽, 후진
	 * 짐을 싣는다.
	 * 연료를 주입한다.
	 * ...
	 * 차를 수리한다.
	 * 부품을 교환한다.
	 * 	---- 관심 있는 것을 정의
	 */
	public void setSpeed(int s) {	// 차의 속도를 설정
		speed = s;
	}
	// int speed;
	public int getSpeed() {	// 속도를 얻는다.
		return speed;	// 반환할 때는 return 키워드를 사용해서 반환할 것을
						// return문 뒤에 위치시킨다.
	}
	// 가속한다.
	public void accerlate(int amount) {
		speed += amount;
	}
	public void injectGas(int gas) {
		this.gas = gas;
	}
	
}
