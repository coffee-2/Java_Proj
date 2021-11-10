package inheritance_07.lab10_downcasting;

public class DowncastingEx02 {

	public static void main(String[] args) {
		Student s;
		Person p;
		s = new Student("박상준");
		
		p = (Person)s; //업캐스팅 할때는 (Person) 생략 가능[강제 데이터타입을 생략 가능]
		p.id = "2000"; p.name = "박";
		p.fly();
		
		s = (Student)p; //다운캐스팅 할때는 (Student) 생략 불가[강제 데이터타입 생략 불가]
		s.id = "3000"; s.name = "신"; s.grade = "4학년"; s.depart = "Front";
		s.fly();
		
		
	}////main
}////////class
