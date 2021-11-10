package inheritance_07.lab14_p322_p337.animal;

public class AnimalEx {
	public static void anisound(Animal animal) {animal.sound();}
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----------");
		
		Animal ani = null;
		ani = new Dog();
		ani.sound();
		ani = new Cat();
		ani.sound();
		System.out.println("----------");
		
		anisound(new Dog());
		anisound(new Cat());
	}////main
}/////class
