package inheritance_07.r;

import inheritance_07.q.A;

public class B extends A{
	void set() {
	//	pri = 1; //private ���� ������ ������ ����� �� ����
	//	def = 2; //default ���� ������ ������ ����� �� ����(�ٸ� ��Ű�� �̱� ����)
		pro = 3;
		pub = 4;
	}
	void showInfo() {
		System.out.println("pro : " + pro);
		System.out.println("pub : " + pub);
	}
	
	
	
}
