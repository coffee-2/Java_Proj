package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		//FileInputStream fis = new FileInputStream("input.txt");
										//��Ŭ������ ������Ʈ �Ʒ� ��ġ
		
		//FileInputStream fis = new FileInputStream("D:\\Temp\\input.txt");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());}
		
		catch (IOException e) {System.out.println(e);}
		finally {
			try {fis.close();} 
			catch (IOException e) {System.out.println(e);}
		}
		
		System.out.println("���α׷� ����");
		
		
		
	}////main
}///////class
