package ch06.problem20;

import java.util.Scanner;

public class BankApplication {
	private static final int MAX_ACCOUNT = 20;
	
	// 계좌정보: 배열 
	private static Account[] accountArray = new Account[MAX_ACCOUNT];
	private static Scanner sc= new Scanner(System.in);
	// 계좌를 해지하지 않는 경우
	private static int count = 0;	// 가입된 계좌수 = 신규로 개설할 계좌를 저장할 위치
	// 계좌를 해지하는 기능이 있는 경우
	// 빈 계좌를 반복문을 써서 배열에서 찾아야 한다. 그래서 빈 계좌에 신규계좌 정보를 넣어야 한다.
	// 해지된 계좌는 빈 계좌가 되므로, 이빨이 빠질 수 있음.
	// 계좌정보를 저장하기 위해 배열을 쓰지 않고 List Collection을 사용한다.

	private static int i;
	
	public static void main(String[] args) {
		boolean run = true;		// 언제 반복문을 종료할 지 모를 때
		int menu;
		// while, do-while
		do {	// 메뉴를 입력을 무조건 받아야 하므로
			System.out.println("---------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");
			menu = sc.nextInt();	// 메뉴를 입력받고 
			if(menu == 1) {	// 계좌생성
				createAccount();	// 메소드로 분리
			} else if(menu == 2) {
				accountList();
			} else if(menu == 3) {	// 예금
				deposit();
			} else if(menu == 4) {	// 출금
				withdraw();
			} else if(menu == 5) {	// 종료
				// do-while을 빠져나간다.
				run = false;
			}
		} while(run);
		System.out.println("프로그램 종료");
		

	}
	// 계정생성
	private static void createAccount() {
		// 계좌생성 출력문 출력
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		// 계좌번호
		System.out.print("계좌번호: ");
		String accountNo = sc.next();	// 문자열 입력
		// 계좌주
		System.out.print("계좌주: ");
		String owner = sc.next();		// 계좌주 입력
		// 초기입금액
		System.out.print("초기입금액: ");
		int money = sc.nextInt();		// 초기입금액 입력
		// 계좌생성
		accountArray[count++] = new Account(accountNo, owner, money);
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}

	private static void accountList() {	// 계좌목록 출력
		// 제목 출력
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		// 계좌별로 정보 출력: 반복문 (count)
		for(int i = 0;i < count;i++) {	// count: 총 계좌수
			Account account = accountArray[i];
			System.out.printf("%10s%6s%8d\n", account.getAno(), account.getName(), account.getBalance());
		}
	}

	private static void deposit() {
		// 예금 출력
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		// 계좌번호 입력
		System.out.print("계좌번호: ");
		String ano = sc.next();
		// 예금액 입력
		System.out.print("예금액: ");
		int money = sc.nextInt();
		// 계좌를 찾는다. (계좌번호로 계좌를 찾는다.) -> 공통부분은 메소드를 만든다.
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;	// 메소드를 종료(더 이상 수행할 필요가 없음)
		}
		// 잔고를 갱신
		// 방법1
		int balance = account.getBalance();
		account.setBalance(balance + money);	// 잔고 갱신
		// 방법2. 새로운 매소드를 만든다. incrementBalance(int money)
		// Setter가 아니라 필요에 의해서 새로운 매소드를 만든 것
		// 결과를 출력
		System.out.println("예금이 성공되었습니다.");
		
	}

	private static void withdraw() {
		// 출금 출력
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		// 계좌번호 입력
		System.out.print("계좌번호: ");
		String ano = sc.next();
		// 출금액 입력
		System.out.print("출금액: ");
		int money = sc.nextInt();
		// 계좌를 찾는다. (계좌번호로 계좌를 찾는다.)
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;	//메소드를 종료(더 이상 수행할 필요가 없음)
		}
		// 잔고를 갱신
		// 방법1
		// 방법2 : 새로운 메소드를만든다. decrementBalance(int money)
		int result = account.decrementBalance(money);
		// 결과를 출력
		if(result == 0) {
			System.out.println("출금이 성공되었습니다.");
		} else {
			System.out.println("잔고가 부족합니다.");
		}
		
	}
	// 계좌번호로 계좌를 검색: 반환형 Account -> 배열
	private static Account findAccount(String ano) {
		for(int i = 0;i < MAX_ACCOUNT;i++);	{
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
				
			}
		}
		return null;	// 없는 계좌 -> 확인해야 함
	}
}
