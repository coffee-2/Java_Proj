package stream_19.other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Temp\\newFile.txt");
		file.createNewFile(); //지정된 경로에 파일을 생성해주는 File 클래스의 메소드
		
		System.out.println(file.isFile());  //파일이 지정된 경로에 존재하면 true, 아니면 false
		
		System.out.println(file.isDirectory()); //폴더(true), 파일(false)
		
		System.out.println(file.getName()); //파일 이름 출력
		
		System.out.println(file.getAbsolutePath()); //파일의 절대경로 출력
			//절대경로
				//Windows : c:\, d:\
				//Linux : root 부터 경로가 정의
		
		System.out.println(file.getPath()); //파일의 상대경로
			//상대경로 : 특정 폴더를 기준으로 출력
		
		System.out.println(file.canRead()); //파일을 읽을 권한이 있는가?
		
		System.out.println(file.canWrite()); //파일을 편집할 권한이 있는가?
		
		file.delete();
		
		System.out.println(file.isFile());
		
		
	}///main
}//////class
