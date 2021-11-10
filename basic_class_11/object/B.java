package basic_class_11.object;

public class B {
			//Object 클래스의 메소드를 사용 및 재정의 할 수 있다.
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
