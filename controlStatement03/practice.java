package controlStatement03;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int fnum=sc.nextInt();
		int a=fnum;
		System.out.printf("���%n");
		/*if(a==1) {System.out.println("���� �������� �ʴ´�");}
		else if(a==2) {System.out.println("�������� �ʴ´�");}
		else if(a==3) {System.out.println("�����̴�");}
		else if(a==4) {System.out.println("�����Ѵ�");}
		else{System.out.println("���� �����Ѵ�");}*/
		
		
		switch(a) {
		case 1: System.out.printf("�����̴� ���� ������ ���� �ϰ���� �ʴ�%n%n");
				
			break;
		case 2: System.out.printf("�����̴� ���� ������ �״� �ϰ���� �ʴ�%n%n");
				
			break;
		case 3: System.out.printf("�����̴� ���� ������ ���� ������ �ϰ�;� �Ѵ�%n%n");
				
			break;
		case 4: System.out.printf("�����̴� ���� ������ �ϰ�;� �Ѵ�%n%n");
				
			break;
		default: System.out.printf("�����̴� ���� ������ ���������ϰ� �ϰ�;� �Ѵ�%n%n");}
	
	
	
	
	}





}
				 
		
		
		


