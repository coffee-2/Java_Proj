package inheritance_07.lab10_downcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("������"); //s�� Person, Student�� �ʵ�� �޼ҵ� ����
		
		p = s;		//��ĳ����  Person p = new Student();
					//p�� Person�� �ʵ�� �޼ҵ常 ����
					//��, �޼ҵ� �������̵��� �޼ҵ忡 ���������� 
					//   ���� ���ε��� ���� �ڽ��� �޼ҵ带 ȣ��
		System.out.println(p.name);
		
		p.fly();
		// p.grade = "A";
		// p.depart = "dance";
		
		s.grade = "A";
		s.depart = "dance";
		
		
		
		
		
	}///main
}///////class
