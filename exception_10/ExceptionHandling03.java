package exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {fis = new FileInputStream("e.txt");} 
		catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("catch 블록 작동");
			return;}
		finally {System.out.println("fianlly 블록 실행");
			if(fis != null) {
				try {
					fis.close(); //객체를 메모리에서 제거(예외 처리 필요)
					System.out.println("객체가 메모리에서 정상적으로 제거됨");} 
				catch (IOException e) {
					System.out.println("객체가 메모리에서 정상적으로 제거되지 않음(Null)");
					System.out.println(e);}  
			}
			System.out.println("프로그램 종료");
		}
		
		
	}////main
}////////class
