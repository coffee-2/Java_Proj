package object06.hide;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	//�ڵ����� getter, setter �����
	//class(ȭ��) ��Ŭ�� -> source Ŭ��
	
	
			//getter : ������ ���� ������ �� ���, public
			//setter : ������ ���� �Ҵ��� �� ���, public
	
	
	/*
	public String getStudentName() {  //getter
		return studentName;}
	public void setStudentName(String studentName) {  //setter
		this.studentName = studentName;}
	*/
	
	
	
	
	
	
	
}////class
