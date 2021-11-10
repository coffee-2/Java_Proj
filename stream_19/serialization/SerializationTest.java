package stream_19.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	/*����ȭ(Serialization) : ��ü�� ���Ͽ� ����
	 * 
	 * 1. Serializable : ������ ��Ʈ�ѷ� ����ȭ
	 * 2. Externalizable : �������� ��Ʈ���� �����ϸ鼭 ����ȭ(�޼ҵ� ������)
	 * ����ȭ�� Serializable �������̽��� ������ ��ü���� ����ȭ ����
	 * ����ȭ�� SerialVersionID(������ȣ) �� �����Ǿ� �־�� ��!!
	 * 
	 */
	
	private static final long serialVersionUID = 5127700800134372584L;
	String name;
	transient String job;
	//transient : ���̸� ����ȭ X
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {return name + ", " + job;}
	
	
}


public class SerializationTest {

	public static void main(String[] args) throws IOException {
		Person Ahn = new Person("�ȳ���", "����");
		Person Kim = new Person("������", "�븮");
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Ahn);
		oos.writeObject(Kim);	//��ü ���� �޼ҵ�
		System.out.println("=== ����ȭ ���� ===");
		
		oos.close();
		
	}//main
}/////class
