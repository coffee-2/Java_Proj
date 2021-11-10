package inheritance_07.lab4;

public class CustomerTest03 { //메소드 오버라이딩, 동적 바인딩

	public static void main(String[] args) {
		Customer Lee = new Customer(10010, "이박사");
		Lee.bp = 1000;
		
		VIPCustomer Park = new VIPCustomer(11010, "박상준", 30010);
		Park.bp = 1000;
		
		int price = 100000;
		
		System.out.println(Lee.getName()+" 님이 지불하실 금액은 "+
		Lee.calprice(price)+"원 이고 포인트는 "+Lee.bp+"점 입니다.");
		System.out.println(Park.getName()+" 님이 지불하실 금액은 "+
		Park.calprice(price)+"원 이고 포인트는 "+Park.bp+"점 입니다.");//메소드 오버라이딩
		//동적 바인딩 : 상속 관계에서 부모클래스와 자식클래스에서 동일한 메소드가 존재할 경우
		//   		 자식클래스의 메소드로 바인딩이 된다.
		
		
		
	}/////main
}////////class
