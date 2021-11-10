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
				System.out.println("outnum = "+outnum+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
				System.out.println("Outer.snum = "+Outer.snum+"(�ܺ� Ŭ������ ����ƽ ����)");}
		}
		
		return new MyRunnable();}
	
	}


public class LocalInnerClass {
	//���� ���� Ŭ����
		//�޼ҵ� ���� Ŭ������ ����
		//�޼ҵ尡 ȣ���� �� ���, �޼ҵ尡 ȣ���� ������ ����
		//�͸� ���� Ŭ���� : ���� ���� Ŭ�������� Ŭ���� �̸��� ������ ��
		// ���ٽ��� ���������� �ڹٿ��� �͸� ���� Ŭ������ �۵���
	
	
	public static void main(String[] args) {
		Outer out = new Outer();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		
	}///////main
}//////////class
