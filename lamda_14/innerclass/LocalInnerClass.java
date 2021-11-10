package lamda_14.innerclass;


class Outer {
	int outnum = 100;
	static int snum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localnum = 10;
			
			@Override
			public void run() {
				//num = 200;
				//i = 100;
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localnum = "+localnum);
				System.out.println("outnum = "+outnum+"(외부 클래스의 인스턴스 변수)");
				System.out.println("Outer.snum = "+Outer.snum+"(외부 클래스의 스태틱 변수)");}
		}
		
		return new MyRunnable();}
	
	}


public class LocalInnerClass {
	//지역 내부 클래스
		//메소드 내에 클래스를 정의
		//메소드가 호출할 때 사용, 메소드가 호출이 끝나면 제거
		//익명 내부 클래스 : 지역 내부 클래스에서 클래스 이름을 생략한 것
		// 람다식은 내부적으로 자바에서 익명 내부 클래스로 작동함
	
	
	public static void main(String[] args) {
		Outer out = new Outer();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		
	}///////main
}//////////class
