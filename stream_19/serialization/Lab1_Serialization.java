package stream_19.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	
	private static final long serialVersionUID = -5379039408078650268L;
	String name;
	int id;
	String phone;
	String email;
	Student() {}
	
	Student(String name, int id, String phone, String email) {
		this.name = name;   this.id = id;
		this.phone = phone; this.email = email;}
	
	@Override
	public String toString() {
		return "이름 : "+name+"\r\n학번 : "+id+"\r\n전화번호 : "+phone+
				"\r\n이메일 : "+email+"\r\n";}
}

public class Lab1_Serialization {

	public static void main(String[] args) throws IOException {
		Student choi = new Student("최병찬", 10342, "010-3356-5847", "choi3356@naver.com");
		Student shin = new Student("신용학", 21327, "010-4984-8837", "shin8837@naver.com");
		Student joo = new Student("주서린", 30914, "010-2947-5749", "joo2947@naver.com");
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(choi);
		oos.writeObject(shin);
		oos.writeObject(joo);
		System.out.println("===직렬화 성공===");
		
		oos.close();
		
		
	}//main
}////class
