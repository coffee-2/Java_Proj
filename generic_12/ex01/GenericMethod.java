package generic_12.ex01;

public class GenericMethod {
	
	public static<T, V> double makeRe(Point<T,V> p1, Point<T,V> p2) {
		double left = ((Number)p1.x).doubleValue();
		double right = ((Number)p2.getx()).doubleValue();
		double bottom = ((Number)p1.y).doubleValue();
		double top = ((Number)p2.gety()).doubleValue();
		
		double width = right - left;
		double height = top - bottom;
		
		return width * height;}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(2, 3.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRe(p1, p2);
		
		System.out.println("두 점 [ "+p1+", "+p2+" ] 으로 만들어진 사각형의 넓이는 "
							+rect+"입니다.");
		
		
		
	}/////main
}/////////class
