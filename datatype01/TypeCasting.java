package datatype01;

public class TypeCasting {

	public static void main(String[] args) {
		
		byte b1 = 65;
		short s1;
		s1=b1;
		System.out.println(b1);
		int num1 = b1+s1;
		System.out.println(num1);
		
		char ch1 = (char)b1;
		System.out.println(ch1);
		
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.println(b2);
		
		int num2 =300;
		b2 = (byte)num2;
		System.out.println(b2);
		
		double d1 = 3.14;
		int num3 = (int)(num2+d1);
		System.out.println("d1=" + d1 + ",num3=" + num3);
		
		
		
		
		
		
		
		
		
		

	}

}
