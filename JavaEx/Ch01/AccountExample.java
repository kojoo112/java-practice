package Ch01;


public class AccountExample {

	public static void main(String[] args) {
		// 계정 생성
		Account account = new Account();
//		account.balance = 10000;
		account.setBalance(10000);		// 10,000
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(-10000);		// 10,000 유지
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(2000000);	// 10,000 유지
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(300000);		// 300,000 
		System.out.println("현재잔고 : " + account.getBalance());
	}

}
