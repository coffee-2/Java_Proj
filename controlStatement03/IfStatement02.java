package controlStatement03;

import java.io.IOException;

public class IfStatement02 {
	public static void main(String[] args) throws IOException {
		int num1=100;
		System.out.println("[if�� ���� ù��°�� ¦/Ȧ�� �Ǵ�]");
		if(num1%2==0) System.out.println("¦��");
		if(num1%2!=0) System.out.println("Ȧ��");
		
		System.out.println("[if�� ���� �ι�°�� ¦/Ȧ�� �Ǵ�]");
		if(num1%2==0) System.out.println("¦��");
		else System.out.println("Ȧ��");
		
		
		
		System.out.println("[���� �����ڷ� ¦/Ȧ�� �Ǵ�]");
		String result = num1%2==0? "¦��":"Ȧ��";
		System.out.println(result);
		
		num1=100;
		System.out.println("[¦/Ȧ�� �Ǵ� �� ¦���� ��� 100�̻����� �Ǵ� if~else]");
		if(num1%2==0) {
		if(num1>=100) System.out.println("¦�� �̸鼭 100�̻�");
		else System.out.println("¦�� �̸鼭 100�̸�");

		}
		num1=27;
		System.out.println("[¦/Ȧ�� �Ǵ� �� ¦���� ��� 100�̻����� �Ǵ� ���� ������]");
		System.out.println(num1%2==0? (num1>=100? "¦�� �̸鼭 100�̻�":"¦�� �̸鼭 100�̸�"):"Ȧ��");
		
		if(num1%2 !=0)  {
			System.out.println("num1��"+num1);
			System.out.println(num1+"�� Ȧ��");
		}
		else System.out.println(num1+"�� ¦��%n%n%n");
		
		System.out.println("���ڸ� �Է��ϼ���.");
		char word = (char)System.in.read();
		if(word>='0' && word<='9') {
			System.out.println("�����Դϴ�.");}
			else {System.out.println("���ڰ� �ƴմϴ�.");}
		System.out.println(word>='0' && word<='9'? "�����Դϴ�.":"���ڰ� �ƴմϴ�.");
		
		
		
		System.in.skip(2);
		System.out.println("�ٽ� �� ���ڸ� �Է��ϼ���.");
		word = (char)System.in.read();
		if(word>='0' && word<='9') {
			if((word-'0')%2==0) {System.out.println("2�� ���");}
			else System.out.println("2�� ����� �ƴ�");
		}
		else {
			if(word>='A' && word<='Z') System.out.println("�빮��");
			else System.out.println("�ҹ���");
		}
	
}
	/*System.in.skip(2); [���� �Ѱ�]
	System.out.println("�ٽ� �� ���ڸ� �Է��ϼ���.");
	word = (char)System.in.read();
	if(word>='0' && word<='9') {
		System.out.println("�����Դϴ�.");}
	else {System.out.println("���ڰ� �ƴմϴ�.");}
	System.out.println(word%2==0? "�����̸鼭 2�� ���" : "�����̸鼭 2�� ����� �ƴ�");
	if(word>='A' && word<='Z') {
		System.out.println("�빮��");
	}
	if(word>='a' && word<='z') {
		System.out.println("�ҹ���");
	}
*/
}
