package inheritance_07.lab10_downcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("홍길동"); //업캐스팅 : 부모클래스의 필드, 메소드 접근
									    //단, 오버라이딩 된 메소드는 자식 메소드 접근(동적 바인딩)
		p.id = "100";
		System.out.println(p.id+","+p.name);
		
		
		Student s = (Student)p; //다운캐스팅 : 부모,자식 클래스의 필드와 메소드 전부 접근
		
		s.depart = "댄스부";
		s.grade = "3학년";
		s.id = "no:ze";
		s.name = "노지혜";
		System.out.println(s.id+","+s.name+","+s.grade+","+s.depart);
		
	}///main
}///////class
