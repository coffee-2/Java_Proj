package lamda_14.innerclass;


class Outer5 {
	int outnum = 100;
	static int snum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			int localnum = 10;
			
			@Override
			public void run() {
				//num = 200;
				//i = 100;
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localnum = "+localnum);
				System.out.println("outnum = "+outnum+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
				System.out.println("Outer5.snum = "+Outer5.snum+"(�ܺ� Ŭ������ ����ƽ ����)");}
		};	
	}
}


public class LocalInnerClass4 {
	//���� ���� Ŭ����
		//�޼ҵ� ���� Ŭ������ ����
		//�޼ҵ尡 ȣ���� �� ���, �޼ҵ尡 ȣ���� ������ ����
		//�͸� ���� Ŭ���� : ���� ���� Ŭ�������� Ŭ���� �̸��� ������ ��
		// ���ٽ��� ���������� �ڹٿ��� �͸� ���� Ŭ������ �۵���
	
	public static void main(String[] args) {
		Outer5 out5 = new Outer5();
		
		Runnable runner = out5.getRunnable(10);
		runner.run();
		
		
	}///////main
}//////////class
