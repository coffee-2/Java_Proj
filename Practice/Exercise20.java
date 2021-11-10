package Practice;
import java.util.ArrayList;
import java.util.Scanner;

/*public class Exercise20 {

	public static void main(String[] args) {
		ArrayList<Account> alist = new ArrayList<Account>();
		Account Kim = new Account("1111-1111", "김정환", 10000);
		Account Lee = new Account("2222-2222", "이도진", 20000);
		Account Park = new Account("3333-3333", "박상준", 30000);
		alist.add(Kim);
		alist.add(Lee);
		alist.add(Park);
		
		Scanner sc = new Scanner(System.in);
		
		boolean run =true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌목록 | 2.예금 | 3.출금 | 4.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>>");
			int sel = sc.nextInt();
				
			if(sel==1) {
				for(Account a : alist) {System.out.println(a.showInfo());}}
			
			else if(sel==2) {System.out.println("--------");
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
						+ account.getBalance() + "원 입니다.");}
			
			else if(sel==3) {System.out.println("--------");
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
						+ account.getBalance() + "원 입니다.");}
			
			else if(sel==4) {run = false;}
		}
		System.out.println("종료합니다.");
		sc.close();
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		ArrayList<Account> alist;
		for(int i=0; i<alist.size(); i++) {
			if(alist!=null) {String dbAno = }
				if(dbAno.equals(ano)) {account = alist; break;}
					}
		
		return account;}
	}*/
	
