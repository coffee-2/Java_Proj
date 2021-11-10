package object06.lab2;
//교재 229page
public class Car {
	int speed;
	int getSpeed() {return speed;}
	void keyTurnOn() {System.out.println("키를 돌려 시동을 겁니다.");}
	void run () {
		for (int i=10; i<=50; i+=10) {
			speed=i;
			System.out.println("차가 달립니다. (시속:" + speed + "km/h)");
		}
	}
	
	
	
	
	
	
	
	
	
	
}///class
