package controlStatement03;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class BreakStatement {

	public static void main(String[] args) {
		int num=0;
		int sum=0;
		for(num=0; num<=100; num++) {sum+=num;}
		System.out.println("sum:"+sum);
		System.out.println("num:"+num);
		
		sum=0;
		for(num=0; num<=100; num++) {
			sum+=num;
			if(sum>=100) break;
		}
		System.out.println("sum:"+sum);
		System.out.println("num:"+num);
		
		sum=0;
		for(num=0; num<2;num++) {
			System.out.println("outter");
			for(int num2=0;num2<5;num2++) {
				if(num2<=2) {System.out.println("inner");break;}
				}
			}
		//��ø�� for������ break�� �� ���� ��ø for�� ��� ���� ����.
		sum=0;
		outter:for(num=0; num<2;num++) {
			System.out.println("outter2");
			for(int num2=0;num2<5;num2++) {
				if(num2==2) {System.out.println("inner2");break outter;}
				}
			}
		
		
		//while������ break��
		sum=0;
		num=1;
		while(num<=10) {
			if(num==5) break;
			sum+=num; num++;}
		System.out.println("sum:"+sum);
		
		//do-while������ break��
		sum=0;
		num=1;
		do {
			if(num==5) break; sum+=num; num++;
			}while(num<=10);
		System.out.println(sum);
		
		
		
		

	}///main
}//////class
