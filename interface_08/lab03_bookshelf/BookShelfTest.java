package interface_08.lab03_bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue sq = new BookShelf();
		sq.enQueue("�¹���");
		sq.enQueue("���̾�");
		sq.enQueue("�˿� ��");
		sq.enQueue("������");
		sq.enQueue("���̵� �����");
		
		System.out.println(sq.getSize());
		System.out.println("=============");
		System.out.println(sq.deQueue());
		System.out.println(sq.deQueue());
		System.out.println(sq.deQueue());
		System.out.println(sq.deQueue());
		System.out.println(sq.deQueue());
		System.out.println("=============");
		System.out.println(sq.getSize());
		
		
	}///main
}//////class
