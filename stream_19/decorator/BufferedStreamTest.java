package stream_19.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

		//BufferesStream : 보조 스트림, RAM 사용. 8KB.
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\c.exe");
		
		BufferedInputStream bis = new BufferedInputStream(fis);	//보조스트림(인풋)
		BufferedOutputStream bos = new BufferedOutputStream(fos); //보조스트림(아웃풋)
		
		long milsec = 0;
		milsec = System.currentTimeMillis();
		
		int i;
		while((i=bis.read()) != -1) {bos.write(i);}
		
		milsec = System.currentTimeMillis() - milsec;
		
		System.out.println("총 소요 시간 : "+milsec+"밀리초");
		
		
		bis.close();
		bos.close();
		
		
	}///////main
}///////////class
