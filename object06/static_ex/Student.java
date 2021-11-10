package object06.static_ex;

public class Student {
	public static int serialNum = 1000;//new 연산자 없이도 접근 가능 : 객체 성성 없이도 접근
	   //각각의 객체가 공유하는 메모리 영역
	   //인스턴스 생성보다 먼저 생성됨
int studentID;
String name;
int grade;
String address;


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
