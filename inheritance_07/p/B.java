package inheritance_07.p;

public class B extends A{
	void set () {
		//pri = 1;  //private ���� ������ �����̱� ������ ���� �Ҵ��� �� ����.
		def = 2;
		pro = 3;
		pub = 4;
	}
	public void showInfo() {
		//System.out.println("pri : " + pri);
		System.out.println("def : " + def);
		System.out.println("pro : " + pro);
		System.out.println("pub : " + pub);
		}
}