package exception_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling02 { //catch{} ������ return;
								//return <= ���α׷� ����� ��������

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {fis = new FileInputStream("d.txt");} 
		catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("catch ��� �۵�");
			return;}
		finally {System.out.println("fianlly ��� ����");}
		
		System.out.println("���α׷� ����");
		
		
	}////main
}///////class
