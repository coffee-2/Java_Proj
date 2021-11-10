package object06.hide.package1_1;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setSpeed(6);
		if(car1.isStop()) {car1.setStop(true);}
		System.out.println("현재 속도 " + car1.getSpeed());
		
		car1.setSpeed(60);
		if(car1.isStop()) {car1.setStop(true);}
		System.out.println("현재 속도 " + car1.getSpeed());
		
		
		
		
		
		
	}////main
}////class
