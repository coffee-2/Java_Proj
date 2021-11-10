package inheritance_07.lab7;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y); //슈퍼 클래스의 생성자 호출
		this.color = color;}
	
	public void showColorPoint() {
		System.out.println(color);
		showpoint();} //상속된 메소드 호출
	
	
}
