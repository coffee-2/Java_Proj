package basic_class_11.object;

public class Book {
	
	int bookNum;
	String bookTitle;
	
	Book() {}
	Book(int bookNum, String bookTitle) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;}
	
	
	public static void main(String[] args) {
		
		Book b1 = new Book(1001, "����");
		Object o = b1; 
		
		
		System.out.println(b1);				
		//��ü ��ü�� ����� ��� : Object Class�� toString() �޼ҵ� ���
		
		System.out.println(b1.toString());
		//Object Class�� toString() �޼ҵ�� ��ü�� �ּ� ���
		//��ü�� ��ü�̸� (��Ű���̸�.Ŭ�����̸�)@Hashcode(�ּ�)
		
		
		
	}///main
}//////class
