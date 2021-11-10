package object06.static_ex;

public class Student3 {
	private static int serialNum = 1000;//외부 클래스에서 직접 접근을 차단
	//getter, setter를 통해서만 접근 가능
	//무결성을 체크해서 적용할 수 있다
int studentID;
String name;
int grade;
String address;

public Student3() {
serialNum++;
studentID = serialNum;}

public String getname () {
return name;}

public void setname (String name) {
this.name = name;}

public static int getserialNum () {
return serialNum;}

public static void setserialNum(int serialNum) {
Student.serialNum = serialNum;}
}
