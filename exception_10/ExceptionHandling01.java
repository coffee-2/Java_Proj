package exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling01 { //try{} catch{} finally{}

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			//fis = new FileInputStream("c.txt");
			fis = new FileInputStream("C:\\test\\c.txt");} 
		catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("catch 블록 작동");}
		finally { //try{} 블록이 실행되면 finally{}는 반드시 실행(예외 발생 여부에 상관없이)
			System.out.println("fianlly 블록 실행");}
		
		System.out.println("프로그램 종료");
		
		
	}////main
}//////class
