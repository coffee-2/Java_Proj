package inheritance_07.lab10_polymorphism;

public class AnimalTest2 {
	public static void moveAnimal(Animal animal) {
		animal.move();}
	
	public static void main(String[] args) {
		
		AnimalTest2.moveAnimal(new Human()); //static : 클래스 이름으로 사용
		AnimalTest2.moveAnimal(new Tiger());
		AnimalTest2.moveAnimal(new Eagle());
		
		
	}////main
}////////class