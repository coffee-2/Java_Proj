package stream_19.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	/*직렬화(Serialization) : 객체를 파일에 저장
	 * 
	 * 1. Serializable : 간단한 컨트롤로 직렬화
	 * 2. Externalizable : 세부적인 컨트롤이 가능하면서 직렬화(메소드 제공됨)
	 * 직렬화는 Serializable 인터페이스를 구현한 객체만이 직렬화 가능
	 * 직렬화의 SerialVersionID(고유번호) 가 생성되어 있어야 함!!
	 * 
	 */
	
	private static final long serialVersionUID = 5127700800134372584L;
	String name;
	transient String job;
	//transient : 붙이면 직렬화 X
	
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
		Person Ahn = new Person("안나현", "인턴");
		Person Kim = new Person("김정우", "대리");
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(Ahn);
		oos.writeObject(Kim);	//객체 저장 메소드
		System.out.println("=== 직렬화 성공 ===");
		
		oos.close();
		
	}//main
}/////class
