package stream_19.inputstream;

import java.io.IOException;

public class SysteminTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");
		
		int i;
		
		try {	//한 글자를 읽어서 아스키 코드로 저장
				//반드시 예외처리 필수
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);} 
		catch (IOException e) {System.out.println(e);}
		
		
	}////main
}/////class
