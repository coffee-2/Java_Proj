package lamda_14.innerclass;


class Outer3 {
	int outnum = 100;
	static int snum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			int localnum = 10;
			
			@Override
			public void run() {
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localnum = "+localnum);
				System.out.println("outnum = "+outnum+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
				System.out.println("Outer.snum = "+Outer3.snum+"(�ܺ� Ŭ������ ����ƽ ����)");}
		};
	}
}



public class LocalInnerClass2 {
	
	
	public static void main(String[] args) {
		Outer3 out3 = new Outer3();
		
		Runnable runner = out3.getRunnable(10);
		runner.run();
		
		
	}///////main
}//////////class
