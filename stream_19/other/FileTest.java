package stream_19.other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Temp\\newFile.txt");
		file.createNewFile(); //������ ��ο� ������ �������ִ� File Ŭ������ �޼ҵ�
		
		System.out.println(file.isFile());  //������ ������ ��ο� �����ϸ� true, �ƴϸ� false
		
		System.out.println(file.isDirectory()); //����(true), ����(false)
		
		System.out.println(file.getName()); //���� �̸� ���
		
		System.out.println(file.getAbsolutePath()); //������ ������ ���
			//������
				//Windows : c:\, d:\
				//Linux : root ���� ��ΰ� ����
		
		System.out.println(file.getPath()); //������ �����
			//����� : Ư�� ������ �������� ���
		
		System.out.println(file.canRead()); //������ ���� ������ �ִ°�?
		
		System.out.println(file.canWrite()); //������ ������ ������ �ִ°�?
		
		file.delete();
		
		System.out.println(file.isFile());
		
		
	}///main
}//////class
