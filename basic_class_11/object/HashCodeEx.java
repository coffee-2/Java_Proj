package basic_class_11.object;

import java.util.Objects;

class Student1{
	int grade;
	String name;
	
	public Student1(int grade, String name) {
		this.grade = grade;
		this.name = name;}
	
	@Override
	public int hashCode() {return Objects.hash(grade, name);}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student1) {
			Student1 std1 = (Student1)obj;
			if(grade==std1.grade && name==std1.name) {return true;}
			else {return false;}
		}
	return false;}
	
}
	
public class HashCodeEx {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(1, "ÃßÀÚÀ±");
		Student1 s2 = new Student1(1, "ÃßÀÚÀ±");
		Student1 s3 = new Student1(2, "±èÁØÈñ");
		
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		System.out.println(Objects.hashCode(s3));
		System.out.println("=========");	
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}///main
}//////class
