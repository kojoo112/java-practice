package ch07.inheritance_super;

public class DmbPhone extends CellPhone {
	// 필드
	int ch;	// 채널
	
	// 생성자 : default 생성자
	public DmbPhone() {
		super();	// 부모 생성자를 호출 : default 생성자 없어서 에러
		// 부모 생성자를 호출한다
	}

	// 생성자
	// 자식 생성자는 부모 생성자를 호출해야 한다.
	public DmbPhone(int ch, String model, String color) {
		super(model, color);
		this.ch = ch;
	}
	
	public void changeChannel(int ch) {
		this.ch = ch;
		System.out.println("채널을 " + ch + "로 변경합니다.");
	}
}
