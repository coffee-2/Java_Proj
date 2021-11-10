package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Animal implements Externalizable{
	String name;
	int age;
	public Animal() {}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;}
	
	@Override
	public String toString() {return name+", "+age+"��";}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();}
	
}



public class Lab2_Externalizable {

	public static void main(String[] args) throws IOException {
		Animal Lion = new Animal("����", 10);
		Animal Tiger = new Animal("ȣ����", 20);
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Lion);
		oos.writeObject(Tiger);
		
		System.out.println("����ȭ ����");
		
		oos.close();
		
	
	}//main
}////class
