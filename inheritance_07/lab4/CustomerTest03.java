package inheritance_07.lab4;

public class CustomerTest03 { //�޼ҵ� �������̵�, ���� ���ε�

	public static void main(String[] args) {
		Customer Lee = new Customer(10010, "�̹ڻ�");
		Lee.bp = 1000;
		
		VIPCustomer Park = new VIPCustomer(11010, "�ڻ���", 30010);
		Park.bp = 1000;
		
		int price = 100000;
		
		System.out.println(Lee.getName()+" ���� �����Ͻ� �ݾ��� "+
		Lee.calprice(price)+"�� �̰� ����Ʈ�� "+Lee.bp+"�� �Դϴ�.");
		System.out.println(Park.getName()+" ���� �����Ͻ� �ݾ��� "+
		Park.calprice(price)+"�� �̰� ����Ʈ�� "+Park.bp+"�� �Դϴ�.");//�޼ҵ� �������̵�
		//���� ���ε� : ��� ���迡�� �θ�Ŭ������ �ڽ�Ŭ�������� ������ �޼ҵ尡 ������ ���
		//   		 �ڽ�Ŭ������ �޼ҵ�� ���ε��� �ȴ�.
		
		
		
	}/////main
}////////class
