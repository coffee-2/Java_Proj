package inheritance_07.abstract_template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("========자율 주행 자동차========");
		Car my = new AiCar();
		my.run();
		
		System.out.println("========사람이 운전하는 자동차========");
		Car u = new ManualCar();
		u.run();
		
		
		
		
	}///main
}//////class
