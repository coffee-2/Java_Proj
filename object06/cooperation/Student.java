package object06.cooperation;

public class Student {
	public String name;  //�л��̸�
	public String grade; //�г�
	public int money;    //���� ��
	
	public Student(String name, String grade, int money) {//�л��̸��� ���� ���� �ʱ�ȭ
		this.name = name;
		this.grade = grade;
		this.money = money;}
	
	public void takeBus (Bus bus) {//������ ���� ��
		bus.take(1000); //���� money�� 1000 �߰�
		this.money -= 1000;}
	
	public void takeSubway (Subway subway) {//����ö�� ���� ��
		subway.take(1500); //����ö money�� 1500 �߰�
		this.money -= 1500;}
		
	public void showInfo() {
		System.out.println(name + grade + "���� ���� ���� " + money + "�� �Դϴ�.");}
	
	
	
}/////class