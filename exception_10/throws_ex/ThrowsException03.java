package exception_10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException03 { 
		//다중 catch 처리
	
	public Class loadClass(String fano, String name) throws FileNotFoundException,
	ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fano);
		Class c = Class.forName(name);	//클래스의 전체 이름을 받아서 존재하는지 확인
		return c;}	//Class.forName(전체클래스) : 동적로딩이 지원, 실행시에 이름 확인
	
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		try {Class d = test.loadClass("C:\\test\\c.txt", "java.lang.String");
				System.out.println(d.getClass());} 
		catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("파일이 없습니다.");} 
		catch (ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("클래스 파일이 없습니다.");}
		catch(Exception e) { //그 외의 모든 Exception은 여기서 처리
			System.out.println(e);}
		
		
		System.out.println("프로그램 종료");
		
		
		
	}///main
}//////class
