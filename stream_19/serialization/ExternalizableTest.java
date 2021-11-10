package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {
	String name;
	int age;
	public Dog() {}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {return name+", "+age+"살";}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();}
}



public class ExternalizableTest {

	public static void main(String[] args) throws IOException {
		Dog Joy = new Dog("조이", 10);
		Dog d1 = new Dog("누렁이", 4);
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\dog.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Joy);
		oos.writeObject(d1);
		System.out.println("직렬화 성공(Externalizable)");
		
		
		oos.close();
		
		
	}//main
}/////class
