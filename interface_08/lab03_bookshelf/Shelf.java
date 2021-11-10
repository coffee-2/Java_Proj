package interface_08.lab03_bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> sh; //선언
	public Shelf() {sh = new ArrayList<String>();} //생성
	
	public ArrayList<String> getShelf() {return sh;}
	public int getCount() {return sh.size();} //책장에 남은 책의 개수
	
}
