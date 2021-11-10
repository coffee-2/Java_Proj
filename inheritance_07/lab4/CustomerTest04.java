package inheritance_07.lab4;

public class CustomerTest04 { //업캐스팅

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(11010, "이정환", 30010); //업캐스팅
		vc.bp = 1000;
		
		System.out.println(vc.getName()+" 님이 지불하실 금액은 "+
		 vc.calprice(10000)+"원 입니다.");
		
		
		
		
		
		
		
		
	}///////main
}////////class
