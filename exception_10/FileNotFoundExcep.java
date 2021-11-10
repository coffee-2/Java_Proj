package exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExcep {
	//예외 처리 1.throws로 처리 : 예외를 미루는 것.
	//예외 처리 2.try ~ catch
	

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {fis = new FileInputStream("b.txt");} 
		catch (FileNotFoundException e) {
			System.out.println(e); //오류 정보 출력 간략하게
			e.printStackTrace();   //오류 정보 출력 자세하게
			System.out.println("catch 블록 호출");}  
			
		System.out.println("프로그램 종료");
		
	}//main
}/////class
