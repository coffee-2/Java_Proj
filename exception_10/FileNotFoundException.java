package exception_10;

import java.io.FileInputStream;

public class FileNotFoundException {
		//FileNotFoundException : ������ ��θ� ã�� �� ���� ��� Exception
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
		fis = new FileInputStream("a.txt");}
		catch(Exception e) {
			System.out.println(e);}
		
		System.out.println("���α׷� ���� ����");
		
		
		
	}////main
}//////class
