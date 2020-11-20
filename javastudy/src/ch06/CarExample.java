package ch06;

public class CarExample {

	public static void main(String[] args) {
		Handle handle;	// 같은 패키지 내에 있으면 불러서 사용 가능
		Car car = new Car();	// 객체를 생성 : 인스턴스
			// heap 영역에 자동차가 하나 생성됨
			// new 연산자 : 객체를 생성(heap 영역에 공간을 확보)
			// Car() : 생성자 -> 객체내의 필드를 초기화
		// 필드 : Car 클래스의 정보 (특성, 상태)
		// 제조사, 색깔, 배기량, 좌석수, 소유자,...
		// car : 참조 변 -> 클래스 변수
		Car car2 = new Car();
		// 가상공간
		// 만들고 싶을 때 만들 수 있다.
		Car car3 = new Car("홍길동");	// 차를 생성하면서 소유자를 초기화
		car3.setSpeed(30);	// 속도를 30키로로 설정
		car3.oil = 100;		// 100L 가솔린을 주입
	}
}
