package stream_19.inputstream;

import java.io.IOException;

public class SysteminTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
		
		int i;
		
		try {
			while((i=System.in.read()) != '\n') {
				System.out.println((char)i);
			}
		} 
		catch (IOException e) {System.out.println(e);}
		
		
	}//main
}////class
