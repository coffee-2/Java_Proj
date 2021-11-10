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
		//equals() �޼ҵ带 �������̵� �ؼ� ��ü�� ���� ���� �� 
		//���ϴ� ������ hashCode() �޼ҵ带 �������̵� �ؾ� �Ѵ�.
	
}

public class EqualTest2 {

	public static void main(String[] args) {
		
		Student2 Lee = new Student2(10425, "������");
		Student2 Lee2 = new Student2(10425, "������");
		
		System.out.println(Lee);
		System.out.println(Lee == Lee2);		//false (�ּҺ�)
		System.out.println(Lee.equals(Lee2));	//false (�ּҺ�)
			//Object Class��  equals() �޼ҵ�� �ּҸ� ��
			//��ü�� id�� ���� ��� ���� ���ٶ�� equals() �޼ҵ� �������̵� �ʿ�.
		
		System.out.println("======================");
		
		System.out.println("Lee�� hashcode : "+Lee.hashCode());
		System.out.println("Lee2�� hashcode : "+Lee2.hashCode());
		
		System.out.println("Lee�� ���� hashcode : "+System.identityHashCode(Lee));
		System.out.println("Lee2�� ���� hashcode : "+System.identityHashCode(Lee2));
		
		
		
	}///main
}//////class
