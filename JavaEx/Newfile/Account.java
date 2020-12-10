package Newfile;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	public static final int MAX_ACCOUNT = 100;
	
	private String accnum;
	private String owner;
	private int money;
	
	
	
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
	
	

}
