package stream_19.inputstream;

import java.io.IOException;

public class SysteminTest1 {

	public static void main(String[] args) {
		System.out.println("���ĺ� �ϳ��� ���� ���͸� ��������");
		
		int i;
		
		try {	//�� ���ڸ� �о �ƽ�Ű �ڵ�� ����
				//�ݵ�� ����ó�� �ʼ�
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);} 
		catch (IOException e) {System.out.println(e);}
		
		
	}////main
}/////class
