package basic_class_11.object;

class Student2{
	int id;
	String name;
	
	public Student2 (int id, String name) {
		this.id = id;
		this.name = name;}

	@Override
	public String toString() {return id + " - " + name;}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 std = (Student2)obj;
			if(id == std.id) {return true;}
			else {return false;}
		}
		return false;}

	@Override
	public int hashCode() {return id;}
		//equals() 메소드를 오버라이딩 해서 객체의 값을 비교할 때 
		//비교하는 변수의 hashCode() 메소드를 오버라이딩 해야 한다.
	
}

public class EqualTest2 {

	public static void main(String[] args) {
		
		Student2 Lee = new Student2(10425, "이유리");
		Student2 Lee2 = new Student2(10425, "이유리");
		
		System.out.println(Lee);
		System.out.println(Lee == Lee2);		//false (주소비교)
		System.out.println(Lee.equals(Lee2));	//false (주소비교)
			//Object Class의  equals() 메소드는 주소를 비교
			//객체의 id가 같은 경우 둘이 같다라고 equals() 메소드 오버라이딩 필요.
		
		System.out.println("======================");
		
		System.out.println("Lee의 hashcode : "+Lee.hashCode());
		System.out.println("Lee2의 hashcode : "+Lee2.hashCode());
		
		System.out.println("Lee의 실제 hashcode : "+System.identityHashCode(Lee));
		System.out.println("Lee2의 실제 hashcode : "+System.identityHashCode(Lee2));
		
		
		
	}///main
}//////class
