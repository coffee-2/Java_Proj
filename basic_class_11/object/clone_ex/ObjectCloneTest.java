package basic_class_11.object.clone_ex;

class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;}
	
	@Override
	public String toString() {return "x = "+x+" , y = "+y;}
	
}

class Circle implements Cloneable{ //implements Cloneable : ��ü ���� ���
	Point p;
	int radius;
	
	public Circle(int x, int y, int radius) {
		p = new Point(x,y);
		this.radius = radius;}
	
	@Override
	public String toString() {
		return "�� ���� "+p+" �̰�, �������� "+radius+" �Դϴ�.";}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();}
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c = new Circle(10, 20, 30);
		
		Circle copyCircle = (Circle) c.clone(); 
		
		System.out.println(c);
		System.out.println(copyCircle);
		System.out.println("======================================");
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(copyCircle));
		
		
	}///main
}///////class
