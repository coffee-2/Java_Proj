package inheritance_07.lab4;

public class CustomerTest01 { //�⺻ ������ ȣ��, Setter�� ���� ���� �Է�

	public static void main(String[] args) {
		Customer Lee = new Customer(); //�θ� ��ü�� �⺻ ������ ȣ��
		Lee.setID(10101);
		Lee.setName("�̹ڻ�");
		Lee.bp = 1000;
		System.out.println(Lee.showInfo());
		
		VIPCustomer Park = new VIPCustomer(); //�ڽ� ��ü�� �⺻ ������ ȣ��
		Park.setID(11010);
		Park.setName("�ڻ���");
		Park.bp = 10000;
		System.out.println(Park.showInfo());
		
		
		
	}////main
}///////class
