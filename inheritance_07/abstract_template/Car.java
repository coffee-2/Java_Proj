package inheritance_07.abstract_template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public void startcar() {System.out.println("�õ��� �̴ϴ�.");}
	public void stopcar() {System.out.println("�õ��� ���ϴ�.");}
	final public void run() {startcar(); drive(); stop(); stopcar();}
	 //���ø� �޼ҵ� : ���� Ŭ�������� �������̵� �� �� ����.
	
	
	
	
	
}
