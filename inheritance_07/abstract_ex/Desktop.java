package inheritance_07.abstract_ex;

public class Desktop extends Computer{ //��ũ��Ʈ Ŭ����

	
	// �߻� �޼ҵ� ������(����������)
	@Override
	public void display() {System.out.println("����ũž �����");}

	@Override
	public void typing() {System.out.println("����ũž Ÿ����");}
	
	
	
	//�Ϲݸ޼ҵ� �������̵�
	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("����ũž�� ������ �մϴ�.");}
	
	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("����ũž�� ������ ���ϴ�.");}
	
	public void dtonly() {System.out.println("����ũž �޼ҵ�");}
	
}
