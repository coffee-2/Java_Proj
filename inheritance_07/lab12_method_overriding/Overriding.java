package inheritance_07.lab12_method_overriding;

class Weapon{
	protected void fire() {System.out.println("기본 살상 능력은 1명");}
}

class Cannon extends Weapon{
	@Override
	protected void fire() {System.out.println("기본 살상 능력은 10명");}
	protected void info() {System.out.println("대포는 살상능력이 큽니다.");}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		Cannon c;
		weapon.fire();
		weapon = new Cannon(); //업캐스팅
		weapon.fire();
		
		c = (Cannon)weapon;//다운캐스팅
		c.info();
		
	}//////main
}//////////class
