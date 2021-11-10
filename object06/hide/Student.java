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
	
	
	//자동으로 getter, setter 만들기
	//class(화면) 우클릭 -> source 클릭
	
	
			//getter : 변수의 값을 돌려줄 때 사용, public
			//setter : 변수의 값을 할당할 때 사용, public
	
	
	/*
	public String getStudentName() {  //getter
		return studentName;}
	public void setStudentName(String studentName) {  //setter
		this.studentName = studentName;}
	*/
	
	
	
	
	
	
	
}////class
