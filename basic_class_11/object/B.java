package basic_class_11.object;

public class B {
			//Object Ŭ������ �޼ҵ带 ��� �� ������ �� �� �ִ�.
	B() {}
	int a = 1;
	void b() {System.out.println(a);}
	
	
	public static void main(String[] args) {
		
		B b = new B();
		Object c = b;
		B d = (B)c;
		b.a = 10;
		b.b();
		
		
		
	}///main
}////class
