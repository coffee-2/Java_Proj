package inheritance_07.lab4;

public class CustomerTest05 {

	public static void main(String[] args) {
		int price = 10000;
		Customer Lee = new Customer(10010, "�̹ڻ�");
		System.out.println(Lee.getName()+" ���� �����Ͻ� �ݾ��� "+
		 Lee.calprice(price)+"�� �Դϴ�.");
		
		
		VIPCustomer Park = new VIPCustomer(11010, "�ڻ���", 30010);
		System.out.println(Park.getName()+" ���� �����Ͻ� �ݾ��� "+
		 Park.calprice(price)+"�� �Դϴ�.");
		
		Customer Kim  = new VIPCustomer(11020, "������", 30011);
		System.out.println(Kim.getName()+" ���� �����Ͻ� �ݾ��� "+
		 Kim.calprice(price)+"�� �Դϴ�.");
		//��ĳ���� : �ڽİ�ü�� �����ؼ� �θ�ü�� Ÿ������ ���� ��ȯ
				 //��, �޼ҵ� �������̵��� ���� ��� ���� ���ε��� ���� �ڽİ�ü�� �޼ҵ尡 ȣ���
		
	}/////main
}////////class
