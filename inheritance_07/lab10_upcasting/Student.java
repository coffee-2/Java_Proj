package inheritance_07.lab10_upcasting;

public class Student extends Person{
	String grade;
	String depart;
	
	public Student(String name) {
		super(name);}
	
	@Override
	public void fly() {System.out.println("�� �ٸ� ��� ��� �����ٰ� �ص�~~~~");}
	
	
	
	
}
