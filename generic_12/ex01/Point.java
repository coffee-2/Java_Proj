package generic_12.ex01;

public class Point<T, V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;}
	
	public T getx() {return x;}
	public V gety() {return y;}

	@Override
	public String toString() {return "("+x+", "+y+")";}
	
	
}
