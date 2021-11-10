package basic_class_11.object;

class Student3{
	int id;
	String name;
	int grade;
	
	public Student3(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;}

	@Override
	public int hashCode() {return id;}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student3) {
			Student3 std3 = (Student3)obj;
			if(name==std3.name) {return true;}
			else {return false;}
		}
		return false;}

	@Override
	public String toString() {return name + ", "+ grade+ "학년";}
	
	
}


public class EqualTest3 {

	public static void main(String[] args) {
		
		Student3 Lee = new Student3(201620403, "이다진", 4);
		Student3 Lee2 = new Student3(201721347, "이다진", 3);
		Student3 Lee3 = new Student3(202020003, "이수진", 2);
		Student3 Lee4 = Lee3;
		
		
		System.out.println(Lee);
		System.out.println(Lee2);
		System.out.println(Lee3);
		System.out.println(Lee4);
		System.out.println("===============");
		System.out.println(Lee==Lee2);			//false
		System.out.println(Lee.equals(Lee2));	//true
		System.out.println(Lee.equals(Lee3));	//false
		System.out.println(Lee3==Lee4);			//true
		System.out.println(Lee3.equals(Lee4));	//true
		System.out.println("===============");
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode());
		System.out.println(Lee3.hashCode());
		System.out.println("===============");
		System.out.println(System.identityHashCode(Lee));
		System.out.println(System.identityHashCode(Lee2));
		System.out.println(System.identityHashCode(Lee3));
		System.out.println(System.identityHashCode(Lee4));
		
		
	}////main
}///////class
