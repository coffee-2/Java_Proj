package object06.static_ex;

public class Student3 {
	private static int serialNum = 1000;//�ܺ� Ŭ�������� ���� ������ ����
	//getter, setter�� ���ؼ��� ���� ����
	//���Ἲ�� üũ�ؼ� ������ �� �ִ�
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
