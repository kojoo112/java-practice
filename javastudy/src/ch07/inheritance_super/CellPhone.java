package ch07.inheritance_super;

public class CellPhone {
	// 필드
	String model;
	String color;
	
	// 생성자
	public CellPhone() { }
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendMessage(String msg) {
		System.out.println(msg + "을 보냅니다.");
	}
	String receiveMessage() {
		System.out.println("수신된 메세지");
		return "수신된 메세지";
	}
	void hangOn() {
		System.out.println("전화를 겁니다.");
	}
	void hangOff() {
		System.out.println("전화를 끊습니다.");
	}
	
	
}
