package stream_19.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\b.exe");
		
		long milsec = 0;	//복사되는 전체 시간을 출력
		milsec = System.currentTimeMillis();
		
		int i;
		int j = 0;
		while((i=fis.read()) != -1) {
			fos.write(i);
			j++;}
		
		milsec = System.currentTimeMillis() - milsec;
		System.out.println("총 소요 시간 : "+milsec+"밀리초");
		System.out.println("총 복사는 byte :"+j);
		
		
		fis.close();
		fos.close();
		
		
	}///main
}/////class
