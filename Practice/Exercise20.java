package Practice;
import java.util.ArrayList;
import java.util.Scanner;

/*public class Exercise20 {

	public static void main(String[] args) {
		ArrayList<Account> alist = new ArrayList<Account>();
		Account Kim = new Account("1111-1111", "����ȯ", 10000);
		Account Lee = new Account("2222-2222", "�̵���", 20000);
		Account Park = new Account("3333-3333", "�ڻ���", 30000);
		alist.add(Kim);
		alist.add(Lee);
		alist.add(Park);
		
		Scanner sc = new Scanner(System.in);
		
		boolean run =true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���¸�� | 2.���� | 3.��� | 4.����");
			System.out.println("-------------------------------------------");
			System.out.println("����>>");
			int sel = sc.nextInt();
				
			if(sel==1) {
				for(Account a : alist) {System.out.println(a.showInfo());}}
			
			else if(sel==2) {System.out.println("--------");
			System.out.println(" ����");
			System.out.println("--------");
			System.out.println("������ ������ ���¹�ȣ�� �Է��ϼ���");
			String ano = sc.next();
			System.out.println("���ݾ��� ��������.");
			int money = sc.nextInt();
			Account account = findAccount(ano); //findAccount �޼ҵ� ȣ��
			if(account==null) {
				System.out.println("���°� �������� �ʽ��ϴ�.");
				return;}
			account.setBalance(account.getBalance() + money);
			System.out.println("���� " + money + "���� Ȯ�εǾ����ϴ�.");
			System.out.println(account.getOwner() + " ���� ������ �ܾ��� " 
						+ account.getBalance() + "�� �Դϴ�.");}
			
			else if(sel==3) {System.out.println("--------");
			System.out.println(" ���");
			System.out.println("--------");
			System.out.println("���� ��ȣ�� �Է��ϼ���.");
			String ano = sc.next();
			System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
			int money = sc.nextInt();
			Account account = findAccount(ano);
			if(account==null) {
				System.out.println("���°� �������� �ʽ��ϴ�.");
				return;}
			account.setBalance(account.getBalance() - money);
			System.out.println("������ ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
			System.out.println(account.getOwner() + " ���� ������ �ܾ��� " 
						+ account.getBalance() + "�� �Դϴ�.");}
			
			else if(sel==4) {run = false;}
		}
		System.out.println("�����մϴ�.");
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
	
