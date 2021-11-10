package object06.final_ex;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("111111-3800782", "이자성");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA"; 
		//p1.ssn = "111111-1111111";   final이 할당된 변수는 값을 수정할 수 없다.
		p1.name = "김주운";
		
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		
		
	}////main
}
