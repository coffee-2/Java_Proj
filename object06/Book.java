package object06;

public class Book {//this() ������ �ٸ� �����ڸ� ȣ��
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
	
	public Book () {
		this ("","");
		System.out.println("������ ȣ���");}
	public Book (String title) {
		this (title, "���� �̻�");}
	public Book (String title, String author) {
		this.title = title; this.author = author;}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�����㺣��");
		Book loveStory = new Book("������");
		Book emptyBook = new Book();
		littlePrince.show(); System.out.println();
		loveStory.show(); System.out.println();
		emptyBook.show();
		
		
		
		
		
		
		
		
		
		
		
	}////main
}///////class
