package object06.final_ex;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("111111-3800782", "���ڼ�");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA"; 
		//p1.ssn = "111111-1111111";   final�� �Ҵ�� ������ ���� ������ �� ����.
		p1.name = "���ֿ�";
		
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		
		
	}////main
}
