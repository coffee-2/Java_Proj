package lamda_14.innerclass;

class A {
	int a = 10;
	static int b = 20;
	
	void a() {System.out.println(a);}
	static void b() {System.out.println(b);}
	
}

class B {
	int a = 100;
	static int b = 200;
	
	Runnable c = new Runnable() {	//�͸� Ŭ����
		@Override
		public void run() {System.out.println("run�� ����մϴ�.");}
	};
}


public class AnomymousClassTest {
	
	public static void main(String[] args) {
		System.out.println("=====�ν��Ͻ� ���� ���=====");
		A a = new A();
		a.a();
		
		System.out.println("=====����ƽ ���� ���=====");
		A.b();
		
		B b = new B();
		
		
	}//main
}////class
