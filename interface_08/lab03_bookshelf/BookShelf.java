package interface_08.lab03_bookshelf;

public class BookShelf extends Shelf implements Queue{
	
	@Override
	public void enQueue(String title) {sh.add(title);} //책장에 책 추가
	
	@Override
	public String deQueue() {return sh.remove(0);} //책장에서 책을 빼냄
	
	@Override
	public int getSize() {return getCount();} //책장의 책의 개수
								//sh.size()도 가능, ArrayList의 방의 개수
	
}
