package object06.hide;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "�̹ڻ�"; //private ���� ������, ���� �Ұ�
		studentLee.setStudentName("�̹ڻ�"); //private ���� ����� ������ setter�� ����
										   //���� �� �Ҵ��ϱ�
		System.out.println("�̸� ���: " + studentLee.getStudentName());
										  //getter�� ���� ���� �� �ҷ�����
		
		
		
		
		
		
		
		
	}///main
}////class
