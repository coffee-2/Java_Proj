package Practice.Fruit_;

public class Apple extends Fruit{
	
	public Apple () {}
	
	public Apple (String name, String color, int size) {
		super(name, color, size);
	}
	
	@Override
	public String showInfo() {
		return "���� �̸��� "+ name+" �̰�, ������ ������ "+color+" �̸�, ������� "
				+size+" �Դϴ�.";}
	public void app() {System.out.println("����Դϴ�.");}
	
}
