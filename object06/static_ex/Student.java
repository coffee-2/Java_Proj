package object06.static_ex;

public class Student {
	public static int serialNum = 1000;//new ������ ���̵� ���� ���� : ��ü ���� ���̵� ����
	   //������ ��ü�� �����ϴ� �޸� ����
	   //�ν��Ͻ� �������� ���� ������
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
