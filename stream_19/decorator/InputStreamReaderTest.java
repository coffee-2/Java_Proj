package stream_19.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
		
			//FileInputStream : ��� ��Ʈ��. ����Ʈ ��Ʈ��.
			//InputSreamReader : ���� ��Ʈ��. ����Ʈ ��Ʈ���� ���� ��Ʈ������ ��ȯ.
			
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("reader.txt");
		int i;
		while((i=fis.read()) != -1) {System.out.print((char)i);}
		
		System.out.println(); System.out.println();
		System.out.println("���� ��Ʈ�� ���");
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"));
		int j;
		while((j=isr.read()) != -1) {System.out.print((char)j);}
		
		fis.close();
		isr.close();
		
		
	}///main
}/////class
