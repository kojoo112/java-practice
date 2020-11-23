package ch06.method_review;

/*	데이터타입 : 기본데이터타입, 참조타입
 *	기본데이터타입 : byte, char, short, int , long, float, double, boolean
 *	참조타입 : String, Array, enum, class, interface
 * 	 - String : 문자열 - char가 모여있는 것 -> class의 일종
 *   - array : 같은 데이터를 여러 개 저장할 수 있는 것
 *   		   인덱스, 반복문을 사용해서 요소에 접근하기 편하다.
 *   		  arr1[0], arr1[1] ...
 *   - 구조체(structure) - C 언어: 여러 타입의 데이터를 저장
 *   		회원정보(Member) : 아이디, 이름, 비밀번호, 전화번호, 주소, 생년월일 
 *   		새로운 데이터 타입으로 간주할 수 있다. -> 배열
 *   객체 : 정보은닉,
 *   
 *    public class member {
 *    		int age;
 *    		String name;
 *    
 *    	// 메소드의 필요성 중의 하나
 *    	// 동작/기능을 정의(수행)
 *    	public void setAge(int age){	// 나이를 설정하는 메소드
 *    		if(age < 0){
 *    			System.out.println("0보다 작은 값이 입력됨");
 *    		} else{	// 0보다 크거나 같으면
 *    			this.age = age;
 *    		}
 *    	}
 *    }
 *    
 *    Member member = new Member();
 *    member.age = 18;
 *    member.name = "홍길동";
 *    member.age = -20;		// 나이가 - ????	// 프로그램으로는 못하는 것이 없음
 *    
 *    
 */

public class ClassReview {
	// 구성 멤버 : 상수, 필드, 생성자, 메소드
	// 상수 : Car -> 최대속도, 최대탑승인원
	public static final int MAX_SPEED = 300;
	public static final int MAX_SEAT_NUM = 5;
	
	// 필드 : 객체의 고유데이터, 상태, 부품
	String model;		// 고유 데이터 : 한번 정해지면 변경 불가
	String company;
	String color;
	int fuel;			// 가솔린 : 변경 가능 (주유한 만큼, 운행을 하면 줄어든다)
	int speed;
	Tire tire[];		// 부품(구성품)
	Engine engine;
	
	// 생성자 : new 연산자와 같이 사용된다.
	// 필드값을 초기화한다.
	// 생성자 오버로딩(overloading) : 매개변수의 유형, 갯수, 순서가 다르면 다른 생성자로 간주한다.
	//		같으면 동일한 것으로 간주 : 컴파일러가 구별을 못함
	public ClassReview() { }	// default 생성자
	// default 생성자 : 생성자가 없으면 컴파일러가 자동 생성
	// 다른 생성자가 있으면 자동 생성하지 않는다.
	// 필요하면 정의를 해줘야 한다.
	public ClassReview(String company) { 
		this.company = company;	// 필드값을 매개변수 값으로 설정
		// 매개변수와 필드가 같은 이름일 경우 구별을 위해 this(class)을 사용
	}
	public ClassReview(String company, String model) {
		this.company = company;
		this.model = model;
	}
	// 메소드 : 동작/기능
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	/* 메소드의 형식
	 * 접근제한자 반환형 메소드이름(매개변수...){
	 * 	// 반환형 : 메소드의 실행 결과를 메소드를 호출한 곳으로 반환한다.
	 *  // ex) 더하기 : 더한 결과를 반
	 *  return 반환하는 값;	// 메소드가 종료
	 *  return; // 반환하는 값이 없을 때도 사용. 메소드를 종료
	 * }
	 * 접근제한자 : public, private, protected
	 */
	public void method1() {	// void : 반환형이 없을 때
		int a = 10;
		if(a < 5) {
			return; // 여기서 method1이 종료 (더 이상 밑으로 실행을 하지 않는다.)
		} else if(a == 5) {
			return;	// 여러 개의 return문이 존재할 수 있음.
		}
		System.out.println("a = " + a);
	}
	
	/* 반환형,매개변수
	 *  무	무 : public void method2(void) { }
	 *  무	유 : public void method3(int num) { }
	 *  유	무 : public int intput() { 키보드로부터 입력받아 반환 }
	 *  유	유 : public int add(int a, int b) { return a + b }
	 *  
	 *  메소드 오버로딩 :
	 *  메소드 형식 : 반환형 메소드이름(매개변수) { }
	 *  반환형과 무관
	 *  int add(int num1, int num2) { }
	 *  double add(int num1, int num2) { } // 위의 메소드와 동일한 것으로 간주 : 반환형이 다르다고 다른 것은 아니다.
	 *  									  메소드 이름은 동일해야 함.
	 *  매개변수의 타입, 갯수, 순서가 다르면 오버로딩이 허용
	 *  public String method7(String model) { }
	 *  public String method7(String owner) { }	// 타입이 같으므로 동일한 메소드
	 *  매개변수의 이름과는 무관하다. 매개변수의 이름은 무엇이든지 가능하다.
	 */
}

class Tire{
	
}

class Engine{
	
}