package object06.hide;

import object06.hide.p.B;
public class A {
	public void a () {
		B b = new B();
		//b.p = 10;  //private ���� ������, ���� �Ұ�
		//b.m = 20;  //default ���� ������, ���� �Ұ�
		//b.k = 30;  //protected ���� ������, ���� ��Ӱ��迡 �ִٸ� ���� ����
		b.n = 40;    //public ���� ������, ���� ����
		
	}
}///class
