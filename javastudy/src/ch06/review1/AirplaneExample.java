package ch06.review1;

public class AirplaneExample {

	public static void main(String[] args) {
		
		// 서울 -> 유럽 스페인에 비행
		// 비행기를 타고 가기 위해서 비행기를 생성
		Airplane myAirplane = new Airplane();
		myAirplane.speed = 340;
		myAirplane.setSpeed(900);
		myAirplane.height = 10000;
		myAirplane.setSpeed(300);
		
	}

}
