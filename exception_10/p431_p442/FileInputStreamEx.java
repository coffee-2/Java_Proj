package exception_10.p431_p442;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("颇老.txt")) {
			fis.read();
			throw new Exception();}
		catch(Exception e) {System.out.println("抗寇 贸府 内靛 角青");}
		
	}////main
}/////class
