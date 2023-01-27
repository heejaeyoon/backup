package chap1;

import java.util.Iterator;
import java.util.Scanner;

public class Account3Ex {
//	private static      int[] accountInt   = new int[100];
//	private static   String[] accountString = new String[100];
	private static Account3[] accountArray = new Account3[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성 하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌 생성");
		System.out.println("--------------");

		System.out.println("계좌번호 :");
		String ano = scanner.next();

		System.out.println("계좌주 :");
		String owner = scanner.next();

		System.out.println("초기 입금액 :");
		int balance = scanner.nextInt();
		
		Account3 newAccount = new Account3(ano, owner, balance);
	
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				break;
			}
			System.out.println("결과: 계좌가 생성되었습니다");
	}
}
	// 계좌 목록 보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌 목록");
		System.out.println("--------------");

		for (int i = 0; i < accountArray.length; i++) {
			Account3 accountNum = accountArray[i];
			if (accountNum != null) {
				System.out.println(accountNum);
			}
		}
	}

	// 예금 하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");

		System.out.println("계좌 번호(000-000형식) : ");
		String accountNum = scanner.next();
		System.out.println("예금액 : ");
		int accountBal = scanner.nextInt();

		Account3 account = findAccount(accountNum);

		if (account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		if (!account.getAno().equals(accountNum)) {
			System.out.println("계좌번호를 잘못 입력하셨습니다.");
			return;
		}

		account.setBalance(account.getBalance() + accountBal);
		System.out.println("예금이 성공되었습니다.");

	}

	// 출금 하기
	private static void withdraw() {
		System.out.println("-------------");
        System.out.println("출금");
        System.out.println("-------------");
		
		System.out.println("계좌번호(000-000형식) : ");
		String accountNum = scanner.next();
		System.out.println("출금액 : ");
		int accountBal = scanner.nextInt();

		Account3 account = findAccount(accountNum);

		if (account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		if (!account.getAno().equals(accountNum)) {
			System.out.println("계좌번호를 잘못 입력하셨습니다.");
			return;
		}
		if (account.getBalance() == 0 || account.getBalance() < accountBal || account.getBalance() - accountBal < 0) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		account.setBalance(account.getBalance() - accountBal);
		System.out.println("출금이 성공되었습니다.");

	}

	private static Account3 findAccount(String ano) {

		Account3 account = null;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String accountNum = accountArray[i].getAno();
				if (accountNum.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}

		}
		return account;
	}

}

// Account 배열에서 ano와 동일한 Account 객체 찾기
//	private static Account3 findAccount(String ano){
// 작성 위치
