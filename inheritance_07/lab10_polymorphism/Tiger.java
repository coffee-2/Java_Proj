package inheritance_07.lab10_polymorphism;

public class Tiger extends Animal{
	@Override
	public void move() {System.out.println("호랑이는 네발로 움직입니다.");}
	
	public void stripe() {System.out.println("호랑이는 줄무늬가 있습니다.");}

}
