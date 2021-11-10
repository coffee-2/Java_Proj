package stream_19.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

		//BufferesStream : ���� ��Ʈ��, RAM ���. 8KB.
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\c.exe");
		
		BufferedInputStream bis = new BufferedInputStream(fis);	//������Ʈ��(��ǲ)
		BufferedOutputStream bos = new BufferedOutputStream(fos); //������Ʈ��(�ƿ�ǲ)
		
		long milsec = 0;
		milsec = System.currentTimeMillis();
		
		int i;
		while((i=bis.read()) != -1) {bos.write(i);}
		
		milsec = System.currentTimeMillis() - milsec;
		
		System.out.println("�� �ҿ� �ð� : "+milsec+"�и���");
		
		
		bis.close();
		bos.close();
		
		
	}///////main
}///////////class
