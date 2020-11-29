package ch07.method_override;

public class AirplaneExample {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.mode = 0;
		sa.fly();
		sa.mode = 1;
		sa.fly();	

	}

}
