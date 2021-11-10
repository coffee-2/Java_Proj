package generic_12.ex02;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,4));
		v.add(new Point(-7,32));
		v.add(new Point(30,-7));
		v.add(new Point(5,2));
		
		v.remove(1); 	//index[1] 의 객체를 삭제
		
		//Vector 의 모든 내용 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);}
		
		
	}/////main
}////////class
