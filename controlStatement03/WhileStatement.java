package controlStatement03;

import java.io.IOException;

public class WhileStatement {
	public static void main(String[] args) throws IOException {
		int i =1;
		int sum=0;
		while(i<=10) {
			sum+=i; i++;
		}
		System.out.println("1���� 10���� ������:"+sum);
		
		i=1;
		sum=0;
		while(i<=1000) {
			if(i%3==0^i%5==0)  sum+=i; i++;}
		System.out.println(sum);
		
		
		/*System.out.println("���ڿ��� �Է��ϼ���.");
		char word;
		//����ڰ� �� �ڸ� �Է��� �� ������ while�� ���(for���� ��� ����)
		while((word=(char)System.in.read()) !=13) {
			System.out.println(word);
		}//while
		System.out.printf("%n");*/
		
		
		
		i=1;
		while(i<5) {int j=1;//i�� ��ȣ
			while(j<5) {//j�� ��ȣ
				if(i==j)System.out.printf("1 ");
				else System.out.printf("0 "); j++;}
			i++; System.out.println();}
		
		
		i=1;
		while(i<6) {int j=1;
			while(j<6) {
				if(i>=j)System.out.printf("* ");
				else System.out.printf(" "); j++;}
		i++; System.out.println();}
		
		i=1;
		while(i<6) {int j=1;
			while(j<6) {
				if(j>=i)System.out.printf("* ");
				else System.out.printf("  "); j++;}
		i++; System.out.println();}
		
		i=2;
		while(i<10) {int j=1;
			while(j<10) {System.out.printf("%d*%d=%d\t",i,j,i*j); j++;}
		i++; System.out.printf("%n");}
		

		
		
		
	}///main
}///////class
