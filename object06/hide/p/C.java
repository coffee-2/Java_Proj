package object06.hide.p;

public class C {  ///B class�� C class�� ���� ��Ű���� �����Ƿ� 
	              ///private ���� ������ ���� ���� ���� ����
	public void c () {
		B b = new B();
		//b.p = 10; //private ���� ������, ���� �Ұ�
		b.m = 20; //default ���� ������, ���� ����
		b.k = 30; //protected ���� ������, ���� ����
		b.n = 40; //public ���� ������, ���� ����
	}
		
	
	

	

	
	
	
}///class
