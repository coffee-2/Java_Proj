package Practice.Fruit_;

public class Banana extends Fruit{
	
	public Banana() {}
	
	public Banana(String name, String color, int size) {
		super(name, color, size);
	}
	
	@Override
	public String showInfo() {
		return "과일 이름은 "+ name+" 이고, 과일의 색깔은 "+color+" 이며, 사이즈는 "
				+size+" 입니다.";}
	public void bana() {System.out.println("바나나 입니다.");}
	
}
