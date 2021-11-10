package object06.hide.p;

public class C {  ///B class와 C class는 같은 패키지에 있으므로 
	              ///private 접근 제한자 빼고 전부 접근 가능
	public void c () {
		B b = new B();
		//b.p = 10; //private 접근 제한자, 접근 불가
		b.m = 20; //default 접근 제한자, 접근 가능
		b.k = 30; //protected 접근 제한자, 접근 가능
		b.n = 40; //public 접근 제한자, 접근 가능
	}
		
	
	

	

	
	
	
}///class
