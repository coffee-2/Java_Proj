package inheritance_07;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.setpoint(20, 30);
		p.showpoint();
		
		System.out.println(p);
		
		ColorPoint cp = new ColorPoint();
		cp.setpoint(3, 4);   //cp 객체는 set이라는 메소드가 없지만 Point 클래스에서 
							 //상속 받아서 사용이 가능함
		cp.setColor("SkyBlue");
		cp.showColorPoint();
		
		System.out.println(cp);
		
	}//////main
}///////class
