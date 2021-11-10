package stream_19.reader;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
				//한글인 경우 글자가 깨져서 출력.
				//문자스트림, 보조스트림으로 처리.

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("reader.txt");
		
		int i;
		while((i=fis.read()) != -1) {System.out.println((char)i);}
		
		fis.close();
		
		
		
	}///main
}/////class
