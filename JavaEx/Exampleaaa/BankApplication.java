package Exampleaaa;

import java.util.Scanner;

public class BankApplication {
	private static final int MAX_ACCOUNT = 2;
	private static final boolean SUCCESS = true;
	
	// 계좌정보 : 배열
	private static Account[] accountArray = new Account[MAX_ACCOUNT];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;	// 언제 반복문을 종료할지 모를 때
		int menu;
		// while, do-while
		do {	// 메뉴를 입력을 무조건 받아야 하므로
			System.out.println("-----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌해지 | 6.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			menu = sc.nextInt();	// 메뉴를 입력받고
			if(menu == 1) {	// 계좌생성
				createAccount();	// 메소드로 분리
			} else if(menu == 2) {
				accountList();
			} else if(menu == 3) {	// 예금
				deposit();
			} else if(menu == 4) {	// 출금
				withdraw();
			} else if(menu == 5) {	// 계좌해지
				removeAccount();
			} else if(menu == 6) {	// 종료
				// do-while을 빠져나간다.
				run = false;
			}
		} while(run);
		System.out.println("프로그램 종료");
	}

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
			if(account.getName().equals(owner)) {
				accountArray[accountIndex] = null;
				System.out.println("결과: 계좌가 해지되었습니다.");
			} else {
				System.out.println("결과: 계좌를 확인하세요.");
			}
		}
	}

	// 계정생성
	private static void createAccount() {
		// 계좌생성 출력문 출력
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		// 계좌번호
		System.out.print("계좌번호: ");
		String accountNo = sc.next();	// 문자열 입력
		// 계좌주
		System.out.print("계좌주: ");
		String owner = sc.next();		// 계좌주 입력
		// 초기입금액
		System.out.print("초기입금액: ");
		int money = sc.nextInt();		// 초기입금액 입력
		if(money > Account.MAX_BALANCE) {	// 잔금 초과 초기 입금액
			System.out.println("결과: 잔고 한도를 초과합니다.");
			return;
		}
		int emptyAccountIndex = findEmptyAccount();
		if(emptyAccountIndex == -1) {	// 빈계좌가 없을 경우
			System.out.println("결과: 계좌를 개설할 수 없습니다.");
		} else {
			// 계좌생성
			accountArray[emptyAccountIndex] = new Account(accountNo, owner, money);
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
	}

	// 빈 계좌 발견
	// return 값 : -1(빈 계좌 없음), 0~4: 빈계좌 인덱스(위치)
	private static int findEmptyAccount() {
		for(int i = 0;i < MAX_ACCOUNT;i++) {
			if(accountArray[i] == null) {
				return i;
			}
		}
		return -1;
	}

	private static void accountList() {	// 계좌목록 출력
		// 제목 출력
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		// 계좌별로 정보 출력 : 반복문 (count)
		for(int i = 0;i < MAX_ACCOUNT;i++) {	// count : 총 계좌수
			Account account = accountArray[i];
			if(account != null) {
				System.out.printf("%7s%6s%8d\n",
						account.getAno(), account.getName(), account.getBalance());
			}
		}
	}

	private static void deposit() {
		// 예금 출력
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		// 계좌번호 입력
		System.out.print("계좌번호: ");
		String ano = sc.next();
		// 예금액 입력
		System.out.print("예금액: ");
		int money = sc.nextInt();
		// 계좌를 찾는다.(계좌번호로 계좌를 찾는다)->공통부분은 메소드를 만든다.
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌번호를 확인하세요.");
			return;	// 메소드를 종료 (더 이상 수행할 필요가 없음)
		}
		// 잔고를 갱신
		if(account.incrementBalance(money) == SUCCESS) {
			System.out.println("결과: 예금이 성공되었습니다.");
		} else {
			System.out.println("결과: 잔고 한도를 초과합니다.");
		}
	}

	private static void withdraw() {
		// 출금 출력
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		// 계좌번호 입력
		System.out.print("계좌번호: ");
		String ano = sc.next();
		// 출금액 입력
		System.out.print("출금액: ");
		int money = sc.nextInt();
		// 계좌를 찾는다.(계좌번호로 계좌를 찾는다)
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌번호를 확인하세요.");
			return;	// 메소드를 종료 (더 이상 수행할 필요가 없음)
		}
		boolean result = account.decrementBalance(money);
		// 결과를 출력
		if(result == SUCCESS) {
			System.out.println("결과: 출금이 성공되었습니다.");
		} else {
			System.out.println("결과: 잔액을 확인하세요.");
		}
	}
	
	private static Account findAccount(String ano) {
		int accountIndex = findAccountIndex(ano);
		if(accountIndex == -1) {
			return null;
		} else {
			return accountArray[accountIndex];
		}
	}
	
	// 계좌번호로 계좌를 검색 : 반환형 Account -> 배열
	private static int findAccountIndex(String ano) {
		for(int i = 0;i < MAX_ACCOUNT;i++) {
			if(accountArray[i] != null && ano.equals(accountArray[i].getAno())) {
				return i;
			}
		}
		return -1;	// 없는 계좌 -> 확인해야 함
	}
}