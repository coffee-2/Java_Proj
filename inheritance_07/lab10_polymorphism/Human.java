package inheritance_07.lab10_polymorphism;

public class Human extends Animal{
	@Override
	public void move() {System.out.println("사람은 두발로 움직입니다.");}
	
	public void hand() {System.out.println("사람은 손이 있습니다.");}
	
}
