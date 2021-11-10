package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("input2.txt");
				//try with resource, Finally에 close를 자동으로 처리
				//FileInputStream은 AutoCloseable 인터페이스의 close() 메소드를 재정의.
			
			int i;
					// i != -1 : 파일의 마지막 끝까지 읽어오는 것.
					// EOF : -1
			while((i=fis.read()) != -1) {System.out.println((char)i);}
			fis.close();
		} 
		
		catch (IOException e) {System.out.println(e);}
		
		
		
	}///main
}///////class
