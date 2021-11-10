package interface_08.lab03_bookshelf;

public interface Queue {
	void enQueue(String title); //책장에 책 넣기
	String deQueue(); //책장에 책 빼기
	int getSize(); //책장에 있는 책 개수
	
}
