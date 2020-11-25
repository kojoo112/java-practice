package ch06.problem20;

public class Account {
	// 상수
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 10000000;
	
	// 필드: 계좌번호, 계좌주, 잔금
	private String ano;
	private String name;	// owner
	private int balance;
	
	// 생성자
	public Account(String ano, String name, int balance) {
		super();	// 부모생성자: Object 클래스
		// 모든 클래스의 부모는 Object 클래스이다.
		this.ano = ano;
		this.name = name;
		this.balance = balance;
	}
	// 메소드: Getter and Setter
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}
	// ???: 최대입금액을 초과하는지 검사
	public void setBalance(int balance) {
		this.balance = balance;
	}
	// 다른 메소드가 필요???
	// 반환형: 메소드의 성공/실패에 대한 결과를 반환해야 한다.
	public int decrementBalance(int money) {
		// 잔고보다 출금액이 많으면 안된다.
		if(money > balance)	{
//			System.out.println("잔고가 부족합니다.");
			return -1;	// 잔고 부족(실패)
		} else {
			balance -= money;
			return 0;	// 성공(잔고 갱신 성공)
		}
		
	}

	
}
