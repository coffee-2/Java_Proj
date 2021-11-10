package inheritance_07.lab10_upcasting;

public class Student extends Person{
	String grade;
	String depart;
	
	public Student(String name) {
		super(name);}
	
	@Override
	public void fly() {System.out.println("두 다리 모두 녹아 내린다고 해도~~~~");}
	
	
	
	
}
