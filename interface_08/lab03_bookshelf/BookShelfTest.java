package interface_08.lab03_bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue sq = new BookShelf();
		sq.enQueue("태백산맥");
		sq.enQueue("데미안");
		sq.enQueue("죄와 벌");
		sq.enQueue("춘향전");
		sq.enQueue("원미동 사람들");
		
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
