package stream_19.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizableReadTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\dog.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog a1 = (Dog) ois.readObject();
		Dog a2 = (Dog) ois.readObject();
		
		System.out.println(a1);
		System.out.println(a2);
		
		
		ois.close();
		
		
	}//main
}/////class
