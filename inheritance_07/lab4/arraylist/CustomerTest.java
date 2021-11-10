package inheritance_07.lab4.arraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10018, "�̵���");
		
		Customer Shin = new Customer(10027, "�Ź̾�");
		
		Customer Noh = new GoldCustomer(10102, "������");
		
		Customer Yu = new GoldCustomer(10125, "��ä��");
		
		Customer Park = new VIPCustomer(11054, "�ڻ���", 20031);
		
		Customer Hwang = new VIPCustomer(11068, "Ȳ����", 20430);
		
		
		list.add(Lee);
		list.add(Shin);
		list.add(Noh);
		list.add(Yu);
		list.add(Park);
		list.add(Hwang);
		
		System.out.println("========== ������ ��� ==========");
		for(Customer c : list) {System.out.println(c.showInfo());}
		
		System.out.println("========== ���ʽ� ����Ʈ�� ������ ��� ==========");
		int price = 10000;
		for(Customer c : list) {int cost = c.calprice(price);
				System.out.println(c.getName()+" ���� "+cost+"�� �����ϼ̽��ϴ�." );
				System.out.println(c.getName()+" ���� ���� ����Ʈ�� "+c.bp+"�� �Դϴ�.");
		}
		
		System.out.println("===================");
		Customer c = list.get(4);
		System.out.println(c.showInfo());
		
		
		
	}/////main
}/////////class
