package Ch01;

public class Account {
	// 상수

	public static final int MINIMUM_BALANCE = 0;
	public static final int MAXIMUM_BALANCE = 1000000;

	// 필드 : 0 <= 잔고 <= 1,000,000
	private int balance; // private : 자신만 접근 가능

	// 접근할 수 있는 방법을 제공 -> getter, setter

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance <= MAXIMUM_BALANCE && balance >= MINIMUM_BALANCE) {
			this.balance = balance;
		}
	}

}
