package stream_19.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
		
			//FileInputStream : 기반 스트림. 바이트 스트림.
			//InputSreamReader : 보조 스트림. 바이트 스트림을 문자 스트림으로 변환.
			
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("reader.txt");
		int i;
		while((i=fis.read()) != -1) {System.out.print((char)i);}
		
		System.out.println(); System.out.println();
		System.out.println("보조 스트림 사용");
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"));
		int j;
		while((j=isr.read()) != -1) {System.out.print((char)j);}
		
		fis.close();
		isr.close();
		
		
	}///main
}/////class
