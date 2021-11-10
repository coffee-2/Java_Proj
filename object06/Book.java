package object06;

public class Book {//this() 문으로 다른 생성자를 호출
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
	
	public Book () {
		this ("","");
		System.out.println("생성자 호출됨");}
	public Book (String title) {
		this (title, "작자 미상");}
	public Book (String title, String author) {
		this.title = title; this.author = author;}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생택쥐베리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		littlePrince.show(); System.out.println();
		loveStory.show(); System.out.println();
		emptyBook.show();
		
		
		
		
		
		
		
		
		
		
		
	}////main
}///////class
