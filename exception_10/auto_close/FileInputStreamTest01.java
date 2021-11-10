package exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {	//AutoClose ���� ��ü ����
										//finally���� fis.close() ȣ��

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\test\\input.txt");
			System.out.println((char)fis.read());	//�� ���ڸ� �о ���ڷ� ���(����)
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());} 
		catch (FileNotFoundException e) {System.out.println(e);}
		catch(IOException e) {System.out.println(e);}
		//IOException ������ FileNotFoundException �� ����
		//catch ��Ͽ� ���� Exception�� ���� ó���ϰ�, ���� Exception�� ó��
		
		finally {
			try {fis.close();} 
			catch (IOException e) {System.out.println(e);}
			catch(NullPointerException e) {System.out.println(e);}
		}
		
		
	}////main
}/////class
