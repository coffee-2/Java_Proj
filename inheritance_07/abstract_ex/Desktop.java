package inheritance_07.abstract_ex;

public class Desktop extends Computer{ //콘크리트 클래스

	
	// 추상 메소드 재정의(오버라이팅)
	@Override
	public void display() {System.out.println("데스크탑 모니터");}

	@Override
	public void typing() {System.out.println("데스크탑 타이핑");}
	
	
	
	//일반메소드 오버라이딩
	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("데스크탑의 전원을 켭니다.");}
	
	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("데스크탑의 전원을 끕니다.");}
	
	public void dtonly() {System.out.println("데스크탑 메소드");}
	
}
