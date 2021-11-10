package exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {	//AutoClose 없이 객체 제거
										//finally에서 fis.close() 호출

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\test\\input.txt");
			System.out.println((char)fis.read());	//한 글자를 읽어서 문자로 출력(영문)
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());} 
		catch (FileNotFoundException e) {System.out.println(e);}
		catch(IOException e) {System.out.println(e);}
		//IOException 하위에 FileNotFoundException 이 존재
		//catch 블록에 하위 Exception을 먼저 처리하고, 상위 Exception을 처리
		
		finally {
			try {fis.close();} 
			catch (IOException e) {System.out.println(e);}
			catch(NullPointerException e) {System.out.println(e);}
		}
		
		
	}////main
}/////class
