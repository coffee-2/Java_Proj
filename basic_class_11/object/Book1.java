package basic_class_11.object;

public class Book1 {
	
	int bookNum;
	String bookTitle;
	
	Book1() {}
	Book1(int bookNum, String bookTitle) {
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;}
	
	@Override
	public String toString() {return bookNum + " . "+ bookTitle;}
	//객체의 주소를 출력하는 것이 아니라 객체의 변수 정보를 출력 하도록 오버라이딩
	
	public static void main(String[] args) {
		Book1 b1 = new Book1(1001, "토지");
		Book1 b2 = new Book1(1002, "사랑방 손님과 어머니");
		
		System.out.println(b1);
		System.out.println(b2.toString());
		
		
		
		
		
	}///main
}//////class
