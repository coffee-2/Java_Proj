package inheritance_07.lab10_downcasting;

public class Student extends Person{
	String grade;
	String depart;
	
	public Student(String name) {
		super(name);}
	
	@Override
	public void fly() {System.out.println("�� �ٸ� ��� ��� �����ٰ� �ص�~~~~");}
	
	
}
