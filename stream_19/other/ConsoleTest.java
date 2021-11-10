package stream_19.other;

import java.io.Console;

public class ConsoleTest {	//명령프롬포트에서 입력 받도록 함. 명령프롬포트에서 실행.
							//1.8까지만 작동
		//컴파일 된 bin 폴더에서 실행할 것!
		//java 전체 패키지 이름.클래스이름  예) stream_19.other.ConsoleTest
	
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름을 입력하세요");
		String name = console.readLine();
		
		System.out.println("직업을 입력 하세요");
		String job = console.readLine();
		
		System.out.println("비밀번호를 입력 하세요");
		char pass [] = console.readPassword();	//readPassword()
		String strPass = new String(pass);	//pass 배열의 값을 String 형으로 전환
		
		System.out.println("==================");
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
		
		
	}///main
}/////class
