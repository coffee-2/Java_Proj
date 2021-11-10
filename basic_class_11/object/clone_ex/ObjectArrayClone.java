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
		MyBook book1 = new MyBook("���õ� �躯");
		MyBook book2 = new MyBook("������");
		MyBook book3 = new MyBook("�����̼�����");
		
		mb.add(book1);
		mb.add(book2);
		mb.add(book3);
		
		ArrayList<MyBook> copyList = (ArrayList) mb.clone();
		copyList.add(new MyBook("12���� �λ��� ��Ģ"));
		
		System.out.println(mb);
		System.out.println(copyList);
		System.out.println("============================================");
		
		book3.setTitle("�ڱ������");
		System.out.println(mb);
		System.out.println(copyList);
		
		
	}////main
}///////class
