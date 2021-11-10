package inheritance_07.lab9;

public class Ex {
	static void paint(Shape p) {
		p.draw(); //업캐스팅
		}
	
	public static void main(String[] args) {
		Line line = new Line(); //line 객체를 생성 후 paint 메소드에 입력
		paint(line);
		
		paint(new Shape()); //paint 메소드 안에서 객체 생성
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	
	}///main
}///////class
