package stream_19.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Temp\\output2.txt");
		file.createNewFile();
		
		try(FileOutputStream fos = new FileOutputStream("D:\\Temp\\output2.txt")) {
			byte bs [] = new byte[26];
			byte data = 65;
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
			//for(int i=65; i<91; i++) {
				//fos.write(i);
			//}
		} 
		catch (IOException e) {System.out.println(e);}
		
		System.out.println("출력이 완료되었습니다.");
		
		
	}///main
}/////class
