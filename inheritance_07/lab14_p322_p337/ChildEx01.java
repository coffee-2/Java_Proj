package inheritance_07.lab14_p322_p337;

public class ChildEx01 {
	public static void method1(Parent01 p) {
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			System.out.println("�޼ҵ�1-Child01�� ��ȯ ����");}
		else {System.out.println("��ȯ ����");}
	}
	
	public static void method2(Parent01 p) {
		Child01 c = (Child01)p;
		System.out.println("�޼ҵ�2-Child01�� ��ȯ ����");}
	
	public static void main(String[] args) {
		Parent01 pa = new Child01();
		method1(pa);
		method2(pa);
		
		Parent01 pb = new Parent01();
		method1(pb);
		method2(pb);
		
		
	}///main
}///////class
