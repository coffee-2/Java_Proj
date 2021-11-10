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
			//�پ��� ������ �ڷ����� ó��. �ƿ�ǲ �ڷ����� ��ǲ �ڷ����� �����ؾ� ��!
		
		dos.writeByte(100);		//byte�� ���
		dos.writeChar('A');		//char �ڷ��� ���
		dos.writeInt(99);		//������ ���
		dos.writeFloat(3.14F);	//Float ���
		dos.writeDouble(6.9);	//double ���
		dos.writeUTF("�ȳ�.");	//String ���
		System.out.println("��� �Ϸ�");
		
		
		System.out.println("��ǲ�ؼ� ���");
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
