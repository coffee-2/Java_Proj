package inheritance_07.lab10_polymorphism;

public class AnimalTest3 {
	public static void moveAnimal(Animal animal) {
		animal.move();}
	
	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		AnimalTest3.moveAnimal(h); //��ü ���� �� �� ��ü�� �޼ҵ� �ȿ� �Է�
		AnimalTest3.moveAnimal(t);
		AnimalTest3.moveAnimal(e);
		
	}////main
}///////class
