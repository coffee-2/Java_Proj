package inheritance_07.lab4;

public class CustomerTest02 {//�Ű������� �Է��� ������ ȣ��

	public static void main(String[] args) {
		Customer Lee = new Customer(10010, "�̹ڻ�");
		Lee.bp = 1000;
		System.out.println(Lee.showInfo());
		
		VIPCustomer Park = new VIPCustomer(11010, "�ڻ���", 30010);
		Park.bp = 10000;
		
		System.out.println(Park.showInfo());
		System.out.println(Park.getAgent());
		
		
		
	}/////main
}//////class
