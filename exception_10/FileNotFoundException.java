package exception_10;

import java.io.FileInputStream;

public class FileNotFoundException {
		//FileNotFoundException : 파일의 경로를 찾을 수 없을 경우 Exception
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
		fis = new FileInputStream("a.txt");}
		catch(Exception e) {
			System.out.println(e);}
		
		System.out.println("프로그램 정상 종료");
		
		
		
	}////main
}//////class
