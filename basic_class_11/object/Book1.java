package basic_class_11.object;

public class Book1 {
	
	int bookNum;
	String bookTitle;
	
	Book1() {}
	Book1(int bookNum, String bookTitle) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;}
	
	@Override
	public String toString() {return bookNum + " . "+ bookTitle;}
	//��ü�� �ּҸ� ����ϴ� ���� �ƴ϶� ��ü�� ���� ������ ��� �ϵ��� �������̵�
	
	public static void main(String[] args) {
		Book1 b1 = new Book1(1001, "����");
		Book1 b2 = new Book1(1002, "����� �մ԰� ��Ӵ�");
		
		System.out.println(b1);
		System.out.println(b2.toString());
		
		
		
		
		
	}///main
}//////class
