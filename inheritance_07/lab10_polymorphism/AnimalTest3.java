package inheritance_07.lab10_polymorphism;

public class AnimalTest3 {
	public static void moveAnimal(Animal animal) {
		animal.move();}
	
	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		AnimalTest3.moveAnimal(h); //객체 생성 후 그 객체를 메소드 안에 입력
		AnimalTest3.moveAnimal(t);
		AnimalTest3.moveAnimal(e);
		
	}////main
}///////class
