package datatype01;

public class JungsuType {
	public static void main(String[] args) {
		byte b1;
		b1 = 127;
		System.out.println(b1);
		
		b1 = (byte)128;
		System.out.println(b1);
		
		byte b2=20, b3=30;
		int num1 = b2 + b3;
		System.out.println(num1);
		
		byte b4 = (byte)(b2 + b3);
		System.out.println(b4);
		
		short s1=1000, s2=2000;
		short s3 = (short)(s1 + s2);
		System.out.println("s3�� �����" + s3);
		
		num1 = 1000;
		long ln1 = 2000;
		long ln2 = num1 + ln1;
		
		long ln3 = 22000000000L;
		System.out.println(ln2);
		System.out.println(ln3);
		
		int num4 = 0412;
		System.out.println(num4);
		
		int num5 = 0x1D;
		System.out.println("num5�� �����" + num5);
		
		int x1 = 89;
		int x2 = 99;
		int x3 = 78;
		int x4 = x1 + x2 + x3;
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		
		/*int ���� = 89;
		int ���� = 99;
		int ���� = 78;
		int ���� = ���� + ���� + ����;
		System.out.println("����:" + ����);
		System.out.println("����:" + ����);
		System.out.println("����:" + ����);
		System.out.println("����:" + ����);*/
		
	}
}
