package interface_08.lab03_bookshelf;

public class BookShelfTest02 {

	public static void main(String[] args) {
		Queue sq = new BookShelf();
		
		for(int i=0; i<100; i++) {
			sq.enQueue("�¹��� "+(i+1));}
		System.out.println("å�� ���� : "+sq.getSize());
		
		for(int i=0; i<30; i++) {
			System.out.println(sq.deQueue());}
		System.out.println("å�� ���� : "+sq.getSize());
		
		
	}/////main
}//////class
