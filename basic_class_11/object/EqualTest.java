package basic_class_11.object;

class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;}

	@Override
	public String toString() {
		return id + " - " + name;}
	
	
}

public class EqualTest {
	
	public static void main(String[] args) {
		Student Lee = new Student(10425, "�̼���");
		Student Lee2 = Lee;
		Student Lee3 = new Student(10425, "�̼���");
		
		if(Lee==Lee2) {System.out.println("�� �ּҴ� �����ϴ�.");}
		else {System.out.println("�� �ּҴ� �ٸ��ϴ�.");}
		
		if(Lee.equals(Lee2)) {System.out.println("Lee = Lee2");}
		else {System.out.println("Lee != Lee2");}
		System.out.println("=====================");
		
		if(Lee==Lee3) {System.out.println("�� �ּҴ� �����ϴ�.");}
		else {System.out.println("�� �ּҴ� �ٸ��ϴ�.");}
		
		if(Lee.equals(Lee3)) {System.out.println("Lee = Lee3");}
		else {System.out.println("Lee != Lee3");}
		
		
		Object o = Lee;
		
		
		
		
		/*
		Object Class �� equals() �޼ҵ�� �� ��ü�� �ּҸ� ��.
		��ü�� ���� ���ϱ� ���ؼ��� Object Class �� equals() �޼ҵ� ������ �ʿ�
		*/
		
	}///main
}//////class
