package object06.hide;

import object06.hide.p.B;
public class A {
	public void a () {
		B b = new B();
		//b.p = 10;  //private 접근 제한자, 접근 불가
		//b.m = 20;  //default 접근 제한자, 접근 불가
		//b.k = 30;  //protected 접근 제한자, 만약 상속관계에 있다면 접근 가능
		b.n = 40;    //public 접근 제한자, 접근 가능
		
	}
}///class
