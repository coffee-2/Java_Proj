package stream_19.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lab1_ReadSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s1 = (Student) ois.readObject();
		Student s2 = (Student) ois.readObject();
		Student s3 = (Student) ois.readObject();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("객체의 내용으로 출력");
		System.out.println(s1.name+", "+s1.id+", "+s1.phone+", "+s1.email);
		System.out.println(s2.name+", "+s2.id+", "+s2.phone+", "+s2.email);
		System.out.println(s3.name+", "+s3.id+", "+s3.phone+", "+s3.email);
		
		ois.close();
		
		
	}//main
}/////class
