package Practice.Fruit_;

public class Orange extends Fruit{
	
	public Orange() {}
	
	public Orange(String name, String color, int size) {
		super(name, color, size);
	}
	
	@Override
	public String showInfo() {
		return "���� �̸��� "+ name+" �̰�, ������ ������ "+color+" �̸�, ������� "
				+size+" �Դϴ�.";}
	public void orn() {System.out.println("�������Դϴ�.");}
	
}
