package stream_19.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterTest {
		
		//FileWriter : �ܺ� ������ �������� ���� ��� ����, ����
		//FileReader : �ܺ� ������ �������� ���� ��� - NotFoundException �߻�

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('A'); //���� �� ���� ���
		
		char buf [] = {'B', 'C', 'D', 'E', 'F', 'G'};
		
		fw.write(buf); //�迭�� ���� ���
		
		fw.write(buf, 1, 2); //�迭�� �Ϻ� �� ���
		
		fw.write("�� forever"); //���ڿ� ���
		
		fw.write("100"); //���� ���
		
		
		fw.close();
		
		System.out.println("���������� ��µǾ����ϴ�.");
		
		
	}///main
}///////class
