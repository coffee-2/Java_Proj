package object06.lab3;
//���� 235page
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
			System.out.println(this.model + " �ڵ����� �޸��ϴ�. "
					+ "(�ü�: " + this.speed + "km/h)");}////this. �� ���� ����!
				}
	
	
	
}////class
