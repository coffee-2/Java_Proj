package object06;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		
		Car car2 = new Car("����");
		System.out.println("\r\ncar2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		
		Car car3 = new Car("���þ�", "����");
		System.out.println("\r\ncar3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		
		Car car4 = new Car("GV80", "����", 360);
		System.out.println("\r\ncar4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		
	}/////main
}////////class
