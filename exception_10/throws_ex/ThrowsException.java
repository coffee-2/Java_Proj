package exception_10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException { 
		//throws : ���ܸ� �̷�� ��, ȣ���ϴ� ������ ���� ó���� �ؾ���
	
	public Class loadClass(String fano, String name) throws FileNotFoundException,
	ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fano);
		Class c = Class.forName(name);	//Ŭ������ ��ü �̸��� �޾Ƽ� �����ϴ��� Ȯ��
		return c;}	//Class.forName(��üŬ����) : �����ε��� ����, ����ÿ� �̸� Ȯ��
	
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		/*
		try {test.loadClass("a.txt", "java.lang.String1");} 
		catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);}
		*/
		
		try {test.loadClass("C:\\test\\b.txt", "java.lang.String");} 
		catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("������ �����ϴ�.");} 
		catch (ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("Ŭ���� ������ �����ϴ�.");}
		
		System.out.println("���α׷� ����");
		
		
		
	}///main
}//////class
