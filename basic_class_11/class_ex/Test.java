package basic_class_11.class_ex;

public class Test { //Ŭ���� ���� ��ü�� ��ü �̸� : ��Ű���̸�.Ŭ�����̸�

	public static void main(String[] args) throws ClassNotFoundException {
		Person p = new Person();
		Class pClass1 = p.getClass(); 
		//Object Ŭ������ getClass() �޼ҵ�
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; 
		//���� class���� ����
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("basic_class_11.class_ex.Person"); 
		//Ŭ���� �̸����� ��������
		System.out.println(pClass3.getName());
		
		System.out.println(p.getClass());
		
		
		
	}///main
}///////class
