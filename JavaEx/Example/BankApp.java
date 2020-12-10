package Example;

import java.util.Scanner;

public class BankApp {

	public static int i;
	private static final int MAX_ACCOUNT = 100;	// 최대 계좌수
	private static Account[] accountArray = new Account[MAX_ACCOUNT]; // 최대 계좌를 객체배열화
	private static Scanner sc = new Scanner(System.in);
	private static int count = 0;
	public static Account a = new Account();
	public static final boolean SUCCESS = true;
	public static void main(String[] args) {		
		
		boolean run = true;
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌해지 |6.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			if(menu == 1) {	
				createAcc(); 	// 생성
			} else if(menu == 2) {	
				accList();		// 리스트
			} else if(menu == 3) {
				deposit();		// 예금
			} else if(menu == 4) {
				withdraw();		// 출금
			} else if(menu == 5) {
				removeAccount();	// 해지
			}else if (menu == 6) {
				run = false;	// 종료
				System.out.println("프로그램 종료");
			}
			
			} while(run);	
		
	}
	
	public static void createAcc() {
		System.out.println("--------");
		System.out.println(" 계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		String accNum = sc.next();	// 번호를 입력받음
		System.out.print("계좌주 : ");
		String accOwner = sc.next();	// 계좌주의 이름
		System.out.print("예금액 : ");
		int accMoney = sc.nextInt();	// 돈은 정수형
		if(accMoney > a.MAX_BALANCE) {
			System.out.println("잔고 한도를 초과합니다");
		} else if(2 <= count) {
			System.out.println("계좌를 개설할 수 없습니다.");
		} else {
			accountArray[count++] = new Account(accNum, accOwner, accMoney);
			System.out.println("계좌가 생성되었습니다.");
		}
	}
	
	private static void accList() {	

		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for(int i = 0;i < MAX_ACCOUNT;i++) {	
			Account account = accountArray[i];
			if(account != null) {
				System.out.printf("%7s%6s%8d\n",
						account.getAccnum(), account.getOwner(), account.getMoney());
			}
		}
	}



	
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		// 계좌입력
		System.out.print("예금액: ");
		int money = sc.nextInt();
		// 금액입력
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌번호를 확인하세요.");
			return;	
		}


		if(account.incrementBalance(money) == SUCCESS) {
			System.out.println("결과: 예금이 성공되었습니다.");
		} else {
			System.out.println("결과: 잔고 한도를 초과합니다.");
		}
	}



	
	public static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		// 계좌번호
		System.out.print("계좌번호 : ");
		String accNum = sc.next();
		Account account = findAccount(accNum);
		// 금액
		System.out.print("출금액 : ");
		int money = sc.nextInt();
		//  돈 입력 후 계좌번호 확인 출력
		if(account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		int result = account.decrementBalance(money);
		if(result == 0) {
			System.out.println("출금이 성공되었습니다.");
		} else {
			System.out.println("잔고가 부족합니다.");
		}
		
	}
	
/*	public static void accCancel() {
		System.out.println("--------");
		System.out.println(" 계좌해지 ");
		System.out.println("--------");
		System.out.print("해지할 계좌번호 : ");
		String accNum = sc.next();
		Account account = findAccount(accNum);
		if(account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;	//메소드를 종료(더 이상 수행할 필요가 없음)
		} else {
			deleteAccount(accNum);
		}
	String accNum1 = account.getAccnum();
		Account acc = deleteAccount(accNum);
		if(acc == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		
	}*/
	
	private static void removeAccount() {
		// 계좌해지 출력문 출력
		System.out.println("-------");
		System.out.println("계좌해지");
		System.out.println("-------");
		// 계좌번호
		System.out.print("계좌번호: ");
		String accountNo = sc.next();	// 문자열 입력
		// 계좌주
		System.out.print("계좌주: ");
		String owner = sc.next();		// 계좌주 입력
		int accountIndex = findAccountIndex(accountNo);
		if(accountIndex == -1) {	// 없는 계좌
			System.out.println("결과: 계좌를 확인하세요.");
		} else {
			Account account = accountArray[accountIndex];
			if(account.getOwner().equals(owner)) {
				accountArray[accountIndex] = null;
				System.out.println("결과: 계좌가 해지되었습니다.");
			} else {
				System.out.println("결과: 계좌를 확인하세요.");
			}
		}
	}
	
	
/*	public static Account deleteAccount(String a) {
		Account acc = new Account();
		acc.setAccnum(null);
		acc.setMoney(0);
		acc.setOwner(null);
		count--;
		for(int i = 0;i < MAX_ACCOUNT;i++);	{
			if(a.equals(accountArray[i].getAccnum())) {
				return accountArray[i];
			}
		}
		return null;
		
	}
	*/
	private static int findAccountIndex(String a) {
		for(int i = 0;i < MAX_ACCOUNT;i++) {
			if(accountArray[i] != null && a.equals(accountArray[i].getAccnum())) {
				return i;
			}
		}
		return -1;	// 없는 계좌 -> 확인해야 함
	}
	
	
	private static Account findAccount(String a) {
		int accountIndex = findAccountIndex(a);
		if(accountIndex == -1) {
			return null;
		} else {
			return accountArray[accountIndex];
		}
	}


	
	public static  void accListOver() {
		System.out.println("계좌를 개설할 수 없습니다.");
	}
	
	// 내가 한 것
	
	// 선생님이 한 것

/*	
	Account account = new Account("111-222", 10000);
 * int findEmptyAccount(){
		for(int i = 0; i < 100; i++) {
			if(accountArray[i] == null) {
				return i;
			}
		}
		return -1; // 비어있는 계좌가 없음
	}
	
	int emptyAccount = findEmptyAccount();{
	if(emptyAccount !=1) {
	accountArray[emptyAccount] = new Account("111-222", 10000);
	}
	accountArray[20] = null; // 계좌해지 할 때 빈계좌라고 null 값을 넣어준다.
	// 정상처리, 오류처리(입금액 초과, 잔금보다 큰 금액을 찾을 때)
	
}*/
}

