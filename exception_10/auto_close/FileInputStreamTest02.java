package exception_10.auto_close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:\\test\\input1.txt")) {} 
		catch (FileNotFoundException e) {System.out.println(e);}
		catch(IOException e) {System.out.println(e);}
		System.out.println("���α׷� ����");
		System.out.println();
		
		/* ���� �Ѱ�
		try(AutoCloseObj obj = new AutoCloseObj()) {
			FileInputStream fis = new FileInputStream("C:\\test\\input01.txt");} 
		catch (Exception e) {System.out.println(e);}
		*/
		
		
	}/////main
}//////class
