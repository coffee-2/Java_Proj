package lamda_14.innerclass;


class Outer4 {
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
				System.out.println("Outer.snum = "+Outer4.snum+"(�ܺ� Ŭ������ ����ƽ ����)");}
		};
	}
}


public class LocalInnerClass3 {
	
	
	public static void main(String[] args) {
		Outer4 out4 = new Outer4();
		
		Runnable runner = out4.getRunnable(10);
		runner.run();
		
		
	}///////main
}//////////class
