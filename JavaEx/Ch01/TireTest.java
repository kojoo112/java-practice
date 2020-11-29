package Ch01;

public class TireTest {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
	    Tire tire = snowTire;	// 자동 타입 변환
	    // 타이어 클래스 타입은 타이어만 보이지만
	    // 재정의를 할 경우는 자식의 메소드를 호출한다
	    // 자식이 재정의한 메소드가 호출됨
	    snowTire.run();	// 스노우 타이어가 굴러갑니다.
	    tire.run();		// 스노우 타이어가 굴러갑니다.
	}

}
