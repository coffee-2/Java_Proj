package operator02;

public class NolliOP {
	public static void main(String[] args) {
		boolean b1=(5>3) && (2>3);
		System.out.println(b1);
		
		boolean b3=!(5<2);
		System.out.println(b3);
		
		System.out.println(false ^ true);
		
		int num1=100, num2=200;
		System.out.println(num1>100 && num2>100);//false
		System.out.println(num1>90 && num2>100);//true
		
		
		//�ܶ�ȸ����
		num1=10;
		int i=2;
		//boolean b4=((num1=num1+10)<10) && ((i=i+2)<10); //�ڿ� �� ����X
		/*boolean b4=((num1=num1+10)<10) & ((i=i+2)<10); //�ڿ� �� ����O
		/System.out.println("b4:"+b4);
		/System.out.println(num1);
		System.out.println(i);
		*/
		
		
		//boolean b4 = ((num1=num1+10)<10) || ((i=i+2)<10);
		boolean b4 = ((num1=num1+10)<10) | ((i=i+2)<10);
		System.out.println("b4:"+b4);
		System.out.println(num1);
		System.out.println(i);
		
		
		
		
		
		
		
		
	}
}
