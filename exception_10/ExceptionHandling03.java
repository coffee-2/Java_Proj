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
			System.out.println("catch ��� �۵�");
			return;}
		finally {System.out.println("fianlly ��� ����");
			if(fis != null) {
				try {
					fis.close(); //��ü�� �޸𸮿��� ����(���� ó�� �ʿ�)
					System.out.println("��ü�� �޸𸮿��� ���������� ���ŵ�");} 
				catch (IOException e) {
					System.out.println("��ü�� �޸𸮿��� ���������� ���ŵ��� ����(Null)");
					System.out.println(e);}  
			}
			System.out.println("���α׷� ����");
		}
		
		
	}////main
}////////class
