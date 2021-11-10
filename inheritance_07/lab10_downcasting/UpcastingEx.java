package inheritance_07.lab10_downcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("노지혜"); //s는 Person, Student의 필드와 메소드 접근
		
		p = s;		//업캐스팅  Person p = new Student();
					//p는 Person의 필드와 메소드만 접근
					//단, 메소드 오버라이딩된 메소드에 접근했을때 
					//   동적 바인딩에 의해 자식의 메소드를 호출
		System.out.println(p.name);
		
		p.fly();
		// p.grade = "A";
		// p.depart = "dance";
		
		s.grade = "A";
		s.depart = "dance";
		
		
		
		
		
	}///main
}///////class
