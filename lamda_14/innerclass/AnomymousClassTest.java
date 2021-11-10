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
	
	Runnable c = new Runnable() {	//익명 클래스
		@Override
		public void run() {System.out.println("run을 출력합니다.");}
	};
}


public class AnomymousClassTest {
	
	public static void main(String[] args) {
		System.out.println("=====인스턴스 변수 출력=====");
		A a = new A();
		a.a();
		
		System.out.println("=====스태틱 변수 출력=====");
		A.b();
		
		B b = new B();
		
		
	}//main
}////class
