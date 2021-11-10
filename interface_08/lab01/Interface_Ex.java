package interface_08.lab01;

public class Interface_Ex {

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		
		sam.printLogo();
		sam.sendcall();
		sam.receivecall();
		sam.flash();
		
		System.out.println("======================");
		//인터페이스는 객체 생성 불가
		//Phone1 p = new Phone1();  오류발생
		Phone1 p = new Samsung(); //타입변환은 가능
		p.printLogo();
		p.sendcall();
		p.receivecall();
		Samsung sp = (Samsung) p;
		sp.flash();
		
	}///main
}///////class

