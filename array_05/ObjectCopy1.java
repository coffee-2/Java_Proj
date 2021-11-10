package array_05;

public class ObjectCopy1 {

	public static void main(String[] args) { //객체 배열 복사: 주소만 복사가 됨(얕은 복사)
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("태백산맥", "조정래");
		book1[1] = new Book("순수이성비판", "칸트");
		book1[2] = new Book("데미안", "헤르만 헤세");
		
		System.arraycopy(book1, 0, book2, 0, 3);
		
		for(int i=0; i<book2.length; i++) {
			book2[i].showBookInfo();}
		
		
		
		
		
		
	}///main
}////class
