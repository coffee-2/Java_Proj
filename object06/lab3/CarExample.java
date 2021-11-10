package object06.lab3;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car("GV80");
		Car car1 = new Car("K5");
		
		mycar.run();
		int speed = mycar.getSpeed();
		System.out.println("현재 속도 " + speed + "km/h");
		System.out.println();
		car1.run();
		int speed1 = car1.getSpeed();
		System.out.println("현재 속도 " + speed1 + "km/h");
		
		
		
		
		
	}////main
}/////class
