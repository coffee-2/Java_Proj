package inheritance_07.abstract_ex;

public abstract class Computer { //�߻� Ŭ���� : Ŭ���� ���ο� �߻� �޼ҵ尡 1�� �̻� ����
								 //�߻� Ŭ������ ��üȭ�� �� ����.
								 //��Ӱ� �������̵��� ���� �߻� �޼ҵ带 Ŭ������ ����
	
	public abstract void display(); //�߻� �޼ҵ� : ���� �Ǿ��ִ� �޼ҵ�. ����� ����
					       //�ݵ�� �ڽ�Ŭ�������� �޼ҵ� �������̵��� ���ؼ� ����.
						  //�޼ҵ� �̸� ��Ģ�� ����.
	
	public void display2() {} //�Ϲ� �޼ҵ� ()-�Ű����� �Է�, {}-�����
	
	public abstract void typing(); 
	
	public void turnOn() {System.out.println("������ �մϴ�.");}
	public void turnOff() {System.out.println("������ ���ϴ�.");}
	
	
	
	
}
