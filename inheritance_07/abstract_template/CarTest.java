package inheritance_07.abstract_template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("========���� ���� �ڵ���========");
		Car my = new AiCar();
		my.run();
		
		System.out.println("========����� �����ϴ� �ڵ���========");
		Car u = new ManualCar();
		u.run();
		
		
		
		
	}///main
}//////class
