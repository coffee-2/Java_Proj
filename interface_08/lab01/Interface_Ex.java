package interface_08.lab01;

public class Interface_Ex {

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		
		sam.printLogo();
		sam.sendcall();
		sam.receivecall();
		sam.flash();
		
		System.out.println("======================");
		//�������̽��� ��ü ���� �Ұ�
		//Phone1 p = new Phone1();  �����߻�
		Phone1 p = new Samsung(); //Ÿ�Ժ�ȯ�� ����
		p.printLogo();
		p.sendcall();
		p.receivecall();
		Samsung sp = (Samsung) p;
		sp.flash();
		
	}///main
}///////class

