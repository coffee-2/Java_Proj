package inheritance_07.lab10_downcasting;

public class DowncastingEx02 {

	public static void main(String[] args) {
		Student s;
		Person p;
		s = new Student("�ڻ���");
		
		p = (Person)s; //��ĳ���� �Ҷ��� (Person) ���� ����[���� ������Ÿ���� ���� ����]
		p.id = "2000"; p.name = "��";
		p.fly();
		
		s = (Student)p; //�ٿ�ĳ���� �Ҷ��� (Student) ���� �Ұ�[���� ������Ÿ�� ���� �Ұ�]
		s.id = "3000"; s.name = "��"; s.grade = "4�г�"; s.depart = "Front";
		s.fly();
		
		
	}////main
}////////class
