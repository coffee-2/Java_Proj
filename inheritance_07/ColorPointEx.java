package inheritance_07;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.setpoint(20, 30);
		p.showpoint();
		
		System.out.println(p);
		
		ColorPoint cp = new ColorPoint();
		cp.setpoint(3, 4);   //cp ��ü�� set�̶�� �޼ҵ尡 ������ Point Ŭ�������� 
							 //��� �޾Ƽ� ����� ������
		cp.setColor("SkyBlue");
		cp.showColorPoint();
		
		System.out.println(cp);
		
	}//////main
}///////class
