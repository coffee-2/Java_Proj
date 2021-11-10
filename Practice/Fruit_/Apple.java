package Practice.Fruit_;

public class Apple extends Fruit{
	
	public Apple () {}
	
	public Apple (String name, String color, int size) {
		super(name, color, size);
	}
	
	@Override
	public String showInfo() {
		return "과일 이름은 "+ name+" 이고, 과일의 색깔은 "+color+" 이며, 사이즈는 "
				+size+" 입니다.";}
	public void app() {System.out.println("사과입니다.");}
	
}
