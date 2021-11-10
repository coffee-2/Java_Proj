package inheritance_07.lab4;

public class CustomerTest01 { //기본 생성자 호출, Setter를 통해 값을 입력

	public static void main(String[] args) {
		Customer Lee = new Customer(); //부모 객체의 기본 생성자 호출
		Lee.setID(10101);
		Lee.setName("이박사");
		Lee.bp = 1000;
		System.out.println(Lee.showInfo());
		
		VIPCustomer Park = new VIPCustomer(); //자식 객체의 기본 생성자 호출
		Park.setID(11010);
		Park.setName("박상준");
		Park.bp = 10000;
		System.out.println(Park.showInfo());
		
		
		
	}////main
}///////class
