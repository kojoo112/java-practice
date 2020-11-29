package ch07.method_override;

public class SuperSonicAirplane extends Airplane {
	int mode;	// 일반비행 : 이륙, 착륙시
				// 초음속비행 : 구름위로
	
	@Override
	public void fly() {
		if (mode ==0) {
			super.fly();	//Airplane의 fly()			
		} else {
			System.out.println("초음속 비행을 합니다.");
		}
		
	}
}
