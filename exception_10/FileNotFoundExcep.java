package exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExcep {
	//���� ó�� 1.throws�� ó�� : ���ܸ� �̷�� ��.
	//���� ó�� 2.try ~ catch
	

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {fis = new FileInputStream("b.txt");} 
		catch (FileNotFoundException e) {
			System.out.println(e); //���� ���� ��� �����ϰ�
			e.printStackTrace();   //���� ���� ��� �ڼ��ϰ�
			System.out.println("catch ��� ȣ��");}  
			
		System.out.println("���α׷� ����");
		
	}//main
}/////class
