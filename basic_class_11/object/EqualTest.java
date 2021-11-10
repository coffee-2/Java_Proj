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
		Student Lee = new Student(10425, "이수진");
		Student Lee2 = Lee;
		Student Lee3 = new Student(10425, "이수진");
		
		if(Lee==Lee2) {System.out.println("두 주소는 같습니다.");}
		else {System.out.println("두 주소는 다릅니다.");}
		
		if(Lee.equals(Lee2)) {System.out.println("Lee = Lee2");}
		else {System.out.println("Lee != Lee2");}
		System.out.println("=====================");
		
		if(Lee==Lee3) {System.out.println("두 주소는 같습니다.");}
		else {System.out.println("두 주소는 다릅니다.");}
		
		if(Lee.equals(Lee3)) {System.out.println("Lee = Lee3");}
		else {System.out.println("Lee != Lee3");}
		
		
		Object o = Lee;
		
		
		
		
		/*
		Object Class 의 equals() 메소드는 두 객체의 주소를 비교.
		객체의 값을 비교하기 위해서는 Object Class 의 equals() 메소드 재정의 필요
		*/
		
	}///main
}//////class
