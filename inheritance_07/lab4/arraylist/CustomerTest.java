package inheritance_07.lab4.arraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10018, "이도진");
		
		Customer Shin = new Customer(10027, "신미애");
		
		Customer Noh = new GoldCustomer(10102, "노지혜");
		
		Customer Yu = new GoldCustomer(10125, "유채린");
		
		Customer Park = new VIPCustomer(11054, "박상준", 20031);
		
		Customer Hwang = new VIPCustomer(11068, "황진영", 20430);
		
		
		list.add(Lee);
		list.add(Shin);
		list.add(Noh);
		list.add(Yu);
		list.add(Park);
		list.add(Hwang);
		
		System.out.println("========== 고객정보 출력 ==========");
		for(Customer c : list) {System.out.println(c.showInfo());}
		
		System.out.println("========== 보너스 포인트와 할인율 계산 ==========");
		int price = 10000;
		for(Customer c : list) {int cost = c.calprice(price);
				System.out.println(c.getName()+" 님이 "+cost+"원 지불하셨습니다." );
				System.out.println(c.getName()+" 님의 현재 포인트는 "+c.bp+"점 입니다.");
		}
		
		System.out.println("===================");
		Customer c = list.get(4);
		System.out.println(c.showInfo());
		
		
		
	}/////main
}/////////class
