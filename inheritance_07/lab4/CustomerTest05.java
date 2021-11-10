package inheritance_07.lab4;

public class CustomerTest05 {

	public static void main(String[] args) {
		int price = 10000;
		Customer Lee = new Customer(10010, "이박사");
		System.out.println(Lee.getName()+" 님이 지불하실 금액은 "+
		 Lee.calprice(price)+"원 입니다.");
		
		
		VIPCustomer Park = new VIPCustomer(11010, "박상준", 30010);
		System.out.println(Park.getName()+" 님이 지불하실 금액은 "+
		 Park.calprice(price)+"원 입니다.");
		
		Customer Kim  = new VIPCustomer(11020, "김정무", 30011);
		System.out.println(Kim.getName()+" 님이 지불하실 금액은 "+
		 Kim.calprice(price)+"원 입니다.");
		//업캐스팅 : 자식객체를 생성해서 부모객체의 타입으로 형식 변환
				 //단, 메소드 오버라이딩이 있을 경우 동적 바인딩에 의해 자식객체의 메소드가 호출됨
		
	}/////main
}////////class
