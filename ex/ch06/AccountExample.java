package ex.ch06;

import java.util.Scanner;

public class AccountExample {
	private static Account arr[] = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	//���� �����ϱ�
	private static void createAccount() {
		System.out.println("--------");
		System.out.println(" ���»���");
		System.out.println("--------");
		System.out.println(" ���� ��ȣ�� �Է��ϼ���.");
		String ano = sc.next();
		System.out.println(" ������");
		String owner = sc.next();
		System.out.println(" �ʱ��Աݾ��� �����ϼ���.");
		int balance = sc.nextInt();
			
		Account newacc = new Account(ano, owner, balance);
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = newacc;
				System.out.println("���°� �����Ǿ����ϴ�.");
					break;}
		}
	}
	
	//���� ��Ϻ���
	private static void accountList() {
		System.out.println("--------");
		System.out.println(" ���¸��");
		System.out.println("--------");
		for(int i=0; i<arr.length; i++) {
			Account account = arr[i];
			if(account != null) {
				System.out.println(account.getAno() + " " + account.getOwner()
				+ " " + account.getBalance());
				System.out.println();}
		}
	}
		
	//�����ϱ�
	private static void deposit() {
		System.out.println("--------");
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
					+ account.getBalance() + "�� �Դϴ�.");
	}
		
		
	//����ϱ�
	private static void withdraw() {
		System.out.println("--------");
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
					+ account.getBalance() + "�� �Դϴ�.");
	}
	
	//arr �迭���� ano(���¹�ȣ)�� ������ ���¹�ȣ�� �˻�
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {String dbAno = arr[i].getAno();
				if(dbAno.equals(ano)) {account = arr[i]; break;}
					}
		}
		return account;
	}	
		
		
	public static void main(String[] args) {
		boolean run =true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.println("����>>");
			int sel = sc.nextInt();
				
			if(sel==1) {createAccount();}
			else if(sel==2) {accountList();}
			else if(sel==3) {deposit();}
			else if(sel==4) {withdraw();}
			else if(sel==5) {run = false;}
		}
		System.out.println("�����մϴ�.");
		sc.close();
			
				
	}///main
}//////class
