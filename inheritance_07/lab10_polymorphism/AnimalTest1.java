package inheritance_07.lab10_polymorphism;

public class AnimalTest1 {
	
	public void moveAnimal(Animal animal) {
		animal.move();}
	
	public static void main(String[] args) {
		
		AnimalTest1 a = new AnimalTest1(); //객체를 생성해서 moveAnimal() 사용
		
		a.moveAnimal(new Human()); //메소드 안에서 바로 객체를 만듦
		a.moveAnimal(new Tiger());
		a.moveAnimal(new Eagle());

	}/////main	
}////////class
