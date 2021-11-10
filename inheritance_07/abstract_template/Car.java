package inheritance_07.abstract_template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public void startcar() {System.out.println("시동을 겁니다.");}
	public void stopcar() {System.out.println("시동을 끕니다.");}
	final public void run() {startcar(); drive(); stop(); stopcar();}
	 //템플릿 메소드 : 하위 클래스에서 오버라이딩 할 수 없음.
	
	
	
	
	
}
