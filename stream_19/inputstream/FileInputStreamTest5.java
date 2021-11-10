package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("resource.txt"); //�д� ��Ʈ��
				FileOutputStream fos = new FileOutputStream("resource.txt"))//�����ϴ� ��Ʈ��
		{	
				//fos : resource.txt ���Ͽ� ���� ��Ʈ��
			fos.write(65); //A
			fos.write(66); //B
			fos.write(67); //C
			fos.write(68); //D
			fos.write(69); //E
			fos.write(70); //F
			
				//fis : resource.txt ���Ͽ��� ���� �о���� ��Ʈ��
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		}
		catch(IOException e) {System.out.println(e);}
		
		
		
		
		
		
		
	}///main
}/////class
