package exception_10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException05 { 
		//���� catch ó��
	
	public Class loadClass(String fano, String name) throws FileNotFoundException,
	ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fano);
		Class c = Class.forName(name);	//Ŭ������ ��ü �̸��� �޾Ƽ� �����ϴ��� Ȯ��
		return c;}	//Class.forName(��üŬ����) : �����ε��� ����, ����ÿ� �̸� Ȯ��
	
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		try {Class d = test.loadClass( "C:\\test\\c.txt", "java.lang.String3");
				System.out.println(d.getClass());} 
		catch(Exception e) { //�� ���� ��� Exception�� ���⼭ ó��
			System.out.println(e);
			System.out.println("������ �����ϴ�");
			System.out.println("Ŭ���� ������ �����ϴ�");}
		
		System.out.println("���α׷� ����");
		
		
		
	}///main
}//////class
