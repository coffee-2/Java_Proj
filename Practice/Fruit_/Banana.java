package Practice.Fruit_;

public class Banana extends Fruit{
	
	public Banana() {}
	
	public Banana(String name, String color, int size) {
		super(name, color, size);
	}
	
	@Override
	public String showInfo() {
		return "���� �̸��� "+ name+" �̰�, ������ ������ "+color+" �̸�, ������� "
				+size+" �Դϴ�.";}
	public void bana() {System.out.println("�ٳ��� �Դϴ�.");}
	
}
