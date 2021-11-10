package basic_class_11.object.clone_ex;

import java.util.ArrayList;

class MyBook implements Cloneable{
	String title;
	public MyBook (String title) {this.title = title;}
	public void setTitle(String title) {this.title = title;}
	
	@Override
	public String toString() {return title;}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();}
	
}

public class ObjectArrayClone {

	public static void main(String[] args) {
		ArrayList<MyBook> mb = new ArrayList<MyBook>();
		MyBook book1 = new MyBook("오늘도 쾌변");
		MyBook book2 = new MyBook("생존자");
		MyBook book3 = new MyBook("순수이성비판");
		
		mb.add(book1);
		mb.add(book2);
		mb.add(book3);
		
		ArrayList<MyBook> copyList = (ArrayList) mb.clone();
		copyList.add(new MyBook("12가지 인생의 법칙"));
		
		System.out.println(mb);
		System.out.println(copyList);
		System.out.println("============================================");
		
		book3.setTitle("자기관리론");
		System.out.println(mb);
		System.out.println(copyList);
		
		
	}////main
}///////class
