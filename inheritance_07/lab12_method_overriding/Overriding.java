package inheritance_07.lab12_method_overriding;

class Weapon{
	protected void fire() {System.out.println("�⺻ ��� �ɷ��� 1��");}
}

class Cannon extends Weapon{
	@Override
	protected void fire() {System.out.println("�⺻ ��� �ɷ��� 10��");}
	protected void info() {System.out.println("������ ���ɷ��� Ů�ϴ�.");}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		Cannon c;
		weapon.fire();
		weapon = new Cannon(); //��ĳ����
		weapon.fire();
		
		c = (Cannon)weapon;//�ٿ�ĳ����
		c.info();
		
	}//////main
}//////////class
