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
			System.out.println("catch ��� �۵�");}
		finally { //try{} ����� ����Ǹ� finally{}�� �ݵ�� ����(���� �߻� ���ο� �������)
			System.out.println("fianlly ��� ����");}
		
		System.out.println("���α׷� ����");
		
		
	}////main
}//////class
