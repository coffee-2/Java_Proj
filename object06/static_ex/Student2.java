package object06.static_ex;

public class Student2 {
	public static int serialNum = 1000;
	int studentID;
	String name;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;}
	
	public String getname () {
	return name;}
	
	public void setname (String name) {
	this.name = name;}
	
	public static int getserialNum () {
	int i = 10;
	return serialNum;}
	
	public static void setserialNum(int serialNum) {
	Student.serialNum = serialNum;}
}
