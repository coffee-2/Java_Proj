package inheritance_07.lab10_downcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("ȫ�浿"); //��ĳ���� : �θ�Ŭ������ �ʵ�, �޼ҵ� ����
									    //��, �������̵� �� �޼ҵ�� �ڽ� �޼ҵ� ����(���� ���ε�)
		p.id = "100";
		System.out.println(p.id+","+p.name);
		
		
		Student s = (Student)p; //�ٿ�ĳ���� : �θ�,�ڽ� Ŭ������ �ʵ�� �޼ҵ� ���� ����
		
		s.depart = "����";
		s.grade = "3�г�";
		s.id = "no:ze";
		s.name = "������";
		System.out.println(s.id+","+s.name+","+s.grade+","+s.depart);
		
	}///main
}///////class
