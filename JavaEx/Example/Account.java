package Example;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private String accnum;
	private String owner;
	private int money;
	
	public Account() { }
	
	public Account(String acc, int money) {
		this.accnum = acc;
		this.money = money;
	}
	
	public Account(String acc, String owner, int money) {
		this.accnum = acc;
		this.owner = owner;
		this.money = money;
	}



	public String getAccnum() {
		return accnum;
	}



	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public int getMoney() {
		return money;
	}

	


	public void setMoney(int money) {
		this.money = money;
	}	
	public int decrementBalance(int a) {
		// 잔고보다 출금액이 많으면 안된다.
		if(a > money)	{
//			System.out.println("잔고가 부족합니다.");
			return -1;	// 잔고 부족(실패)
		} else {
			money -= a;
			return 0;	// 성공(잔고 갱신 성공)
		}
		
	}
	
	public boolean incrementBalance(int a) {
		if(money + a > MAX_BALANCE) {	// 잔고 한도 초과
			return false;
		} else {
			money += a;
			return true;
		}
	}


	

}
