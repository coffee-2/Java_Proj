package inheritance_07.lab5_super;

public class B extends A{
	
	public B() {System.out.println("������ B");}
	
	public B(int x) {
		super(x); //������ �Ű������� �ִ� �����ڸ� ȣ��
		System.out.println("�Ű����� ������ B "+x);}
	
}
