package exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling02 { //catch{} 내에서 return;
								//return <= 프로그램 블록을 빠져나옴

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {fis = new FileInputStream("d.txt");} 
		catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("catch 블록 작동");
			return;}
		finally {System.out.println("fianlly 블록 실행");}
		
		System.out.println("프로그램 종료");
		
		
	}////main
}///////class
