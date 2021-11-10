package exception_10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException { 
		//throws : 예외를 미루는 것, 호출하는 곳에서 예외 처리를 해야함
	
	public Class loadClass(String fano, String name) throws FileNotFoundException,
	ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fano);
		Class c = Class.forName(name);	//클래스의 전체 이름을 받아서 존재하는지 확인
		return c;}	//Class.forName(전체클래스) : 동적로딩이 지원, 실행시에 이름 확인
	
	
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
			System.out.println("파일이 없습니다.");} 
		catch (ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("클래스 파일이 없습니다.");}
		
		System.out.println("프로그램 종료");
		
		
		
	}///main
}//////class
