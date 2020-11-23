package ch06.instance_member;

public class PhoneExample {

	// 정적 메소드 : 객체의 생성없이 접근이 가능
	// JVM이 프로그램을 실행시킬 때 PhoneExample.main()호출
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		// 인스턴스 필드에 접근
		myPhone.model = "Galaxy S10 5g";
		myPhone.setNumber("010-1234-5678");
		System.out.println("모델 : " + myPhone.model);
		System.out.println("번호 : " + myPhone.number);
		
		// 정적 필드에 접근 : 공통 데이터 -> 객체 생성과는 무관
		// static은 객체를 생성하지 않고도 접근 가능
		Phone.asPeriod = 1; // 클래스 이름을 사용해서 접근
		System.out.println("AS기간 : " + Phone.asPeriod);
		
		Phone myFriend = new Phone();	// 객체가 여러개 생성
		System.out.println("AS기간 : " + Phone.asPeriod);
		System.out.println("AS기간 : " + myFriend.asPeriod);
			// static 멤버는 참조변수로 접근하지 않는다. (권고사항)
			// static 멤버는 클래스 이름으로 접근(권고사항)
		Phone.setAsPeriod(2);	// 정적 메소드 : 클래스 이름으로 접근
		ClassA ca = new ClassA();
		ca.method();	// PhoneExample에서 사용한 값이
		// ClassA의 method에서 같은 값을 사용할 수 있음.
		// static 필드는 공용으로 데이터를 사용 가능.		

	}

}
