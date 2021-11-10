package stream_19.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\b.exe");
		
		long milsec = 0;	//����Ǵ� ��ü �ð��� ���
		milsec = System.currentTimeMillis();
		
		int i;
		int j = 0;
		while((i=fis.read()) != -1) {
			fos.write(i);
			j++;}
		
		milsec = System.currentTimeMillis() - milsec;
		System.out.println("�� �ҿ� �ð� : "+milsec+"�и���");
		System.out.println("�� ����� byte :"+j);
		
		
		fis.close();
		fos.close();
		
		
	}///main
}/////class
