package controlStatement03;

import java.io.IOException;

public class IfStatement03 {
	public static void main(String[] args) throws IOException {
		int kor=99, eng=80, math=89;
		double avg=(kor+eng+math)/3.0;

		if(avg>=90) System.out.println("A����");
		else if(avg>=80) System.out.println("B����");
		else if(avg>=70) System.out.println("C����");
		else if(avg>=60) System.out.println("D����");
		else System.out.println("F����%n%n%n");
		
		
		//System.out.println("�� ���ڸ� �Է��ϼ���.");
		//char word = (char)System.in.read();
		//if (word>='0' && word<='9' && (word-'0')%2==0) System.out.println("�����̸鼭 2�� ���");
	    //else if(word>='0' && word<='9' && (word-'0')%2!=0) System.out.println("���� �̸鼭 2�� ����� �ƴ�");
		//else if(word>='A' && word<='Z') {System.out.println("�빮��");}
		//else System.out.println("�ҹ���");
		
		/*[���� �Ѱ�]
		 * System.out.println("�� ���ڸ� �Է��ϼ���.");
		char word = (char)System.in.read();
		if(word>='0' && word<='9') {
			if((word-'0')%2==0) {System.out.println("2�� ���");}
			else System.out.println("2�� ����� �ƴ�");
		}
		else if(word>='A' && word<='Z') {System.out.println("�빮��");}
		else System.out.println("�ҹ���");
		*/
		
		
		System.out.println("�ٸ� �� ���ڸ� �Է��ϼ���.");
		char a = (char)System.in.read();
		if(a>='0' && a<='9') {System.out.println("����");}
		else if(a>='A' && a<='Z' || a>='a' && a<='z') {System.out.println("���ĺ�");}
		else {System.out.println("��Ÿ");}
		
		/* [���� �Ѱ�]
		System.out.println("�ٸ� �� ���ڸ� �Է��ϼ���.");
		char word1 = (char)System.in.read();
		if(word1>='0' && word1<='9') {System.out.println("����");}
		else if(word1>='A' && word1<='Z' || word1>='a' && word1<='z') {System.out.println("���ĺ�");}
		else {System.out.println("��Ÿ");}
		*/
		
		
		
		
		
		
		int num1=49, num2=278, num3=90;
		
		if(num1>num2 && num2>num3) {System.out.println("�ִ밪:"+num1);}
		else if(num2>num3 && num3>num1) {System.out.println("�ִ밪:"+num2);}
		else {System.out.println("�ִ밪:"+num3);}
		//if(num1>num2 || num1>num3 || num2>num3) {System.out.println("�ִ밪:"+num1);}
		
		
		
		
		
		
		
		
	}//main
}////class
