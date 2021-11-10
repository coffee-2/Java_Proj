package object06.lab3;
//교재 235page
public class Car {

	String model;
	int speed;
	int getSpeed () {return speed;}
	
	Car(String model) {
		this.model = model;}
	
	void setSpeed(int speed) {
		this.speed = speed;}
	
	void run () {
		for(int i=20; i<=100; i+=20) {
			this.setSpeed(i);
			System.out.println(this.model + " 자동차가 달립니다. "
					+ "(시속: " + this.speed + "km/h)");}////this. 은 생략 가능!
				}
	
	
	
}////class
