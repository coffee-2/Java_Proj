package inheritance_07.lab10_polymorphism;

public class AnimalTest1 {
	
	public void moveAnimal(Animal animal) {
		animal.move();}
	
	public static void main(String[] args) {
		
		AnimalTest1 a = new AnimalTest1(); //��ü�� �����ؼ� moveAnimal() ���
		
		a.moveAnimal(new Human()); //�޼ҵ� �ȿ��� �ٷ� ��ü�� ����
		a.moveAnimal(new Tiger());
		a.moveAnimal(new Eagle());

	}/////main	
}////////class
