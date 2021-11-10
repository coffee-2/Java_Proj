package inheritance_07.abstract_template;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행을 합니다.");
		System.out.println("차가 스스로 방향전환을 합니다.");}

	@Override
	public void stop() {System.out.println("스스로 멈춥니다.");}
	
	
	
	
	
}
