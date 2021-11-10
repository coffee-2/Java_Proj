package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("input2.txt");
				//try with resource, Finally�� close�� �ڵ����� ó��
				//FileInputStream�� AutoCloseable �������̽��� close() �޼ҵ带 ������.
			
			int i;
					// i != -1 : ������ ������ ������ �о���� ��.
					// EOF : -1
			while((i=fis.read()) != -1) {System.out.println((char)i);}
			fis.close();
		} 
		
		catch (IOException e) {System.out.println(e);}
		
		
		
	}///main
}///////class
