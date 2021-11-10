package inheritance_07.r;

import inheritance_07.q.A;

public class B extends A{
	void set() {
	//	pri = 1; //private 접근 제한자 변수라 사용할 수 없음
	//	def = 2; //default 접근 제한자 변수라 사용할 수 없음(다른 패키지 이기 때문)
		pro = 3;
		pub = 4;
	}
	void showInfo() {
		System.out.println("pro : " + pro);
		System.out.println("pub : " + pub);
	}
	
	
	
}
