package inheritance_07.lab9;

public class Ex {
	static void paint(Shape p) {
		p.draw(); //��ĳ����
		}
	
	public static void main(String[] args) {
		Line line = new Line(); //line ��ü�� ���� �� paint �޼ҵ忡 �Է�
		paint(line);
		
		paint(new Shape()); //paint �޼ҵ� �ȿ��� ��ü ����
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	
	}///main
}///////class
