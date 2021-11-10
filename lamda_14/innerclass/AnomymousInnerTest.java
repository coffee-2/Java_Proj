package lamda_14.innerclass;

class Outer2 {
	
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
				System.out.println();}
		};
	}
	Runnable runner = new Runnable() {
		@Override
		public void run() {System.out.println("Runnable이 구현된 익명 클래스 변수 ");}
	};
	

	
}///Outer2

public class AnomymousInnerTest {

	public static void main(String[] args) {
		Outer2 out2 = new Outer2();
		
		Runnable run = out2.getRunnable(10);
		
		run.run();
		out2.runner.run();
		
		
		
	}//////main
}//////class
