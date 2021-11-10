package lamda_14.innerclass;


class OutClass {		//외부 클래스
	
	private int num = 10;
	private static int snum = 20;	//객체화 없이도 사용(클래스 이름으로 호출)
	
	private InClass inclass;	//외부의 클래스를 객체화 할 때, 내부 클래스도 객체화 하기 위한 변수
	
	public OutClass() {	//생성자 : 외부 클래스의 생성자 호출시 내부 클래스를 객체화
		inclass = new InClass();}	
	
	void outTest1() {System.out.println("인스턴스 외부 클래스의 인스턴스 메소드");}
	static void outTest2() {System.out.println("인스턴스 외부 클래스의 정적 메소드");}
	public void usingClass() {inclass.intest();}
	
	class InClass{		//내부 클래스
						//외부 클래스의 생성자를 생성해야 호출 가능
		int innum = 100;
		//static int sinnum = 200; //인스턴스 내부 클래스에서는 정적 변수를 사용할 수 없다.
									//(클래스 앞에 static 붙이면 사용 가능)
		
		void intest() {
			System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass snum = "+snum+"(외부 클래스의 스태틱 변수)");
			System.out.println("InClass innum = "+innum+"(내부 클래스의 인스턴스 변수)");}
		
		//static void stest() {} 인스턴스 내부 클래스에서는 정적 메소드 사용 불가!
		
		public void usingClass() {inclass.intest();}
		
	}
	
	static class sInClass {	//정적 내부 클래스
							//인스턴스 변수,메소드와 정적 변수,메소드 모두 사용 가능
							//외부 클래스의 생성자를 생성하지 않아도 호출 가능
		int innum = 100;
		static int sinnum = 200;
		
		void sintest() {
			//num += 10;  //외부 클래스의 인스턴스 변수 사용 불가
			System.out.println("OutClass snum = "+snum+"(외부 클래스의 스태틱 변수)");
			System.out.println("sInClass sinnum = "+sinnum+"(내부 클래스의 스태틱 변수");
			System.out.println("sInClass innum = "+innum+"(내부 클래스의 인스턴스 변수)");}
		
		static void sinstest() {
			//num += 10;
			//innum += 10;
			System.out.println("OutClass snum"+snum+"(외부 클래스의 스태틱 변수)");
			System.out.println("sInClass sinum"+sinnum+"(내부 클래스의 스태틱 변수");}
			
	}
	
}


public class InerClassTest {

	public static void main(String[] args) {
		
		OutClass oclass = new OutClass();	//외부 클래스 객체 생성
		System.out.println("외부 클래스 호출하여 내부 클래스 기능 호출");
		oclass.usingClass();
		System.out.println();
		
		OutClass.InClass iclass = oclass.new InClass();		//내부 클래스 객체 생성
		System.out.println("외부 클래스 변수를 사용하여 내부 클래스 객체 생성");
		iclass.intest();
		System.out.println();
		
		OutClass.sInClass sinclass = new OutClass.sInClass();
		System.out.println("정적 내부 클래스의 인스턴스 메소드 호출");
		sinclass.sintest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.sInClass.sinstest();
		
		
	}////main
}/////class
