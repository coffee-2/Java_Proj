package exception_10.p431_p442;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("����.txt")) {
			fis.read();
			throw new Exception();}
		catch(Exception e) {System.out.println("���� ó�� �ڵ� ����");}
		
	}////main
}/////class
