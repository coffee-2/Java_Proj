package operator02;

public class BitOP {
	public static void main(String[] args) {
		byte num1=45;
		byte num2=25;
		int result = num1&num2;
		System.out.println(result);
		
		byte b1=10, bit1=2;
		int result2 = b1<<bit1;
		System.out.println(result2);
		
		
		b1=-9;
		result= b1>>bit1;
		
		System.out.printf("%d>>%d의 결과: %d%n", b1,bit1,result);
		
		b1=-3;
		bit1=3;
		result = b1>>>bit1;
		System.out.printf("%d>>>%d의 결과: %d%n",b1,bit1,result);
		
		

	}

}

