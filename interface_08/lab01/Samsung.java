package interface_08.lab01;

public class Samsung implements Phone1{

	@Override
	public void sendcall() {System.out.println("��ȭ�� �̴ϴ�.");}

	@Override
	public void receivecall() {System.out.println("��ȭ�� �޽��ϴ�.");}
	
	public void flash() {System.out.println("��ȭ�⿡ ���� �������ϴ�.");}
	
	@Override
	public void printLogo() {System.out.println(" Samsung ");}
	
}
