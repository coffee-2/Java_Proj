package stream_19.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterTest {
		
		//FileWriter : 외부 파일이 존재하지 않을 경우 생성, 쓰기
		//FileReader : 외부 파일이 존재하지 않을 경우 - NotFoundException 발생

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('A'); //문자 한 글자 출력
		
		char buf [] = {'B', 'C', 'D', 'E', 'F', 'G'};
		
		fw.write(buf); //배열의 값을 출력
		
		fw.write(buf, 1, 2); //배열의 일부 값 출력
		
		fw.write("너 forever"); //문자열 출력
		
		fw.write("100"); //숫자 출력
		
		
		fw.close();
		
		System.out.println("정상적으로 출력되었습니다.");
		
		
	}///main
}///////class
