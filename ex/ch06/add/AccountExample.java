package ex.ch06.add;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountExample {
	//private static Account arr[] = new Account[100];
	private static ArrayList<Account> arr = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("--------");
		System.out.println(" 계좌생성");
		System.out.println("--------");
		System.out.println(" 계좌 번호를 입력하세요.");
		String ano = sc.next();
		System.out.println(" 계좌주");
		String owner = sc.next();
		System.out.println(" 초기입금액을 설정하세요.");
		int balance = sc.nextInt();
			
		Account newacc = new Account(ano, owner, balance);
		arr.add(newacc);
		System.out.println("계좌가 생성되었습니다.");}
	
	//계좌 목록보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println(" 계좌목록");
		System.out.println("--------");
		for(int i=0; i<arr.size(); i++) {
			Account account = arr.get(i);
			if(account != null) {
				System.out.println(account.getAno() + " " + account.getOwner()
				+ " " + account.getBalance());
				System.out.println();}
		}
	}
		
	//예금하기
	private static void deposit() {
		System.out.println("--------");
		System.out.println(" 예금");
		System.out.println("--------");
		System.out.println("예금할 계좌의 계좌번호를 입력하세요");
		String ano = sc.next();
		System.out.println("예금액을 넣으세요.");
		int money = sc.nextInt();
		Account account = findAccount(ano); //findAccount 메소드 호출
		if(account==null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;}
		account.setBalance(account.getBalance() + money);
		System.out.println("예금 " + money + "원이 확인되었습니다.");
		System.out.println(account.getOwner() + " 고객님 계좌의 잔액은 " 
					+ account.getBalance() + "원 입니다.");
	}
		
		
	//출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println(" 출금");
		System.out.println("--------");
		System.out.println("계좌 번호를 입력하세요.");
		String ano = sc.next();
		System.out.println("출금하실 금액을 입력하세요.");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;}
		account.setBalance(account.getBalance() - money);
		System.out.println("고객님의 계좌에서 " + money + "원이 출금되었습니다.");
		System.out.println(account.getOwner() + " 고객님 계좌의 잔액은 " 
					+ account.getBalance() + "원 입니다.");
	}
	
	//arr 배열에서 ano(계좌번호)와 동일한 계좌번호를 검색
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i)!=null) {String dbAno = arr.get(i).getAno();
				if(dbAno.equals(ano)) {account = arr.get(i); break;}
					}
		}
		return account;
	}	
		
		
	public static void main(String[] args) {
		boolean run =true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>>");
			int sel = sc.nextInt();
				
			if(sel==1) {createAccount();}
			else if(sel==2) {accountList();}
			else if(sel==3) {deposit();}
			else if(sel==4) {withdraw();}
			else if(sel==5) {run = false;}
		}
		System.out.println("종료합니다.");
		sc.close();
		
		
	}///main
}//////class
