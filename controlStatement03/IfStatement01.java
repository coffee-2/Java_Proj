package controlStatement03;

import java.io.IOException;

public class IfStatement01 {
	public static void main(String[] args) throws IOException  {
		int num=10;
		if(num%2==0) {System.out.printf("%s: ¦��%n",num);};
		
		int num1=10;
		if(num1%2!=0) {System.out.printf("%s: Ȧ��%n",num1);};
		
		if(num1%2!=0 && num1>=9) {System.out.printf("%d: Ȧ���̰� 9���� ũ�ų� ���� ���̴�%n",num1);};
		
		if(true) System.out.println("�׻� ����Ǵ� ��ɹ�");
		if(false) System.out.println("����� ������ �ȵǴ� ��ɹ�");
		
		if(num1%2 !=0)// ;������ �ʰ� ����
			{System.out.printf("%d�� Ȧ��%n",num1);}
		
		if(num1%2==0) System.out.printf("%d�� ¦��%n",num1);
	
		num1=9;
		if(num1%2!=0) {System.out.printf("num1�� %d�̴�%n",num1);
					   System.out.printf("%d�� Ȧ���̴�.%n",num1);
					   System.out.printf("�׷��Ƿ� num1�� Ȧ���̴�%n");}
		
		
		/*System.out.println("1. �� ���ڸ� �Է��ϼ���.");
		int asciicode = System.in.read();
		System.out.println("����ڰ� �Է��� ������ �ƽ�Ű �ڵ尪:"+asciicode);
		System.out.println("����ڰ� �Է��� ������ �ƽ�Ű �ڵ尪:"+(char)asciicode);
		
		//����ڰ� �Է��� ���ڰ� �������� �ƴ����� �Ǵ�
		//1]�ƽ�Ű �ڵ尪�� �� ��
		boolean isNumber = asciicode>=48 && asciicode <=57;
		if(isNumber) System.out.println("�Է��� ���ڴ� �����Դϴ�.");
		if(!isNumber) System.out.println("�Է��� ���ڴ� ���ڰ� �ƴմϴ�.");
		
		//2]�ƽ�Ű �ڵ尪�� �� ��
		isNumber = asciicode>='0' && asciicode <='9';
		if(isNumber) System.out.println("�Է��� ���ڴ� �����Դϴ�.");
		if(!isNumber) System.out.printf("�Է��� ���ڴ� ���ڰ� �ƴմϴ�.%n%n%n");
		*/
		
		

		
		System.out.println("���ڸ� �Է��ϼ���.");
		int word;
		word = (int)System.in.read();
		//1]if�� ���� if������ ó��
		if(word>='0'&&word<='9') {
			if(word%2==0) System.out.println("2�� ����Դϴ�.");
			if(word%2==1) System.out.println("2�� ����� �ƴմϴ�.");
		}
		
				
		
		
		
		
	}
}
