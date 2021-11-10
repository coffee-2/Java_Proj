package stream_19.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\data.txt");
		FileInputStream fis = new FileInputStream("D:\\Temp\\data.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
			//다양한 형식의 자료형을 처리. 아웃풋 자료형과 인풋 자료형이 동일해야 함!
		
		dos.writeByte(100);		//byte로 출력
		dos.writeChar('A');		//char 자료형 출력
		dos.writeInt(99);		//정수값 출력
		dos.writeFloat(3.14F);	//Float 출력
		dos.writeDouble(6.9);	//double 출력
		dos.writeUTF("안녕.");	//String 출력
		System.out.println("출력 완료");
		
		
		System.out.println("인풋해서 출력");
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		
		dos.close();
		dis.close();
		
	}//main
}/////class
