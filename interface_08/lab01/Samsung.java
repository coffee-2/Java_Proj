package interface_08.lab01;

public class Samsung implements Phone1{

	@Override
	public void sendcall() {System.out.println("전화를 겁니다.");}

	@Override
	public void receivecall() {System.out.println("전화를 받습니다.");}
	
	public void flash() {System.out.println("전화기에 불이 켜졌습니다.");}
	
	@Override
	public void printLogo() {System.out.println(" Samsung ");}
	
}
