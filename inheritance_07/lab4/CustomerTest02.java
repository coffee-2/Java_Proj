package inheritance_07.lab4;

public class CustomerTest02 {//매개변수를 입력해 생성자 호출

	public static void main(String[] args) {
		Customer Lee = new Customer(10010, "이박사");
		Lee.bp = 1000;
		System.out.println(Lee.showInfo());
		
		VIPCustomer Park = new VIPCustomer(11010, "박상준", 30010);
		Park.bp = 10000;
		
		System.out.println(Park.showInfo());
		System.out.println(Park.getAgent());
		
		
		
	}/////main
}//////class
