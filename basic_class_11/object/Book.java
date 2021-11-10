package basic_class_11.object;

public class Book {
	
	int bookNum;
	String bookTitle;
	
	Book() {}
	Book(int bookNum, String bookTitle) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;}
	
	
	public static void main(String[] args) {
		
		Book b1 = new Book(1001, "개미");
		Object o = b1; 
		
		
		System.out.println(b1);				
		//객체 자체를 출력할 경우 : Object Class의 toString() 메소드 출력
		
		System.out.println(b1.toString());
		//Object Class의 toString() 메소드는 객체의 주소 출력
		//객체의 전체이름 (패키지이름.클래스이름)@Hashcode(주소)
		
		
		
	}///main
}//////class
