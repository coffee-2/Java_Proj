package interface_08.lab03_bookshelf;

public class BookShelf extends Shelf implements Queue{
	
	@Override
	public void enQueue(String title) {sh.add(title);} //å�忡 å �߰�
	
	@Override
	public String deQueue() {return sh.remove(0);} //å�忡�� å�� ����
	
	@Override
	public int getSize() {return getCount();} //å���� å�� ����
								//sh.size()�� ����, ArrayList�� ���� ����
	
}
