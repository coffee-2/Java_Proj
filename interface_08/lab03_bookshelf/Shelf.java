package interface_08.lab03_bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> sh; //����
	public Shelf() {sh = new ArrayList<String>();} //����
	
	public ArrayList<String> getShelf() {return sh;}
	public int getCount() {return sh.size();} //å�忡 ���� å�� ����
	
}
