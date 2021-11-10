package array_05;

public class ObjectCopy2 {//배열의 얕은 복사. 주소만 복사
						  //원본 배열의 값이 바뀌면 복붙한 배열의 값도 바뀜.

	public static void main(String[] args) {
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("태백산맥", "조정래");
		book1[1] = new Book("순수이성비판", "칸트");
		book1[2] = new Book("데미안", "헤르만 헤세");
		
		System.arraycopy(book1, 0, book2, 0, 3);
		
		for(int i=0; i<book2.length; i++) {
			book2[i].showBookInfo();}
		
		book1[0].setBookName("나목");  //원본을 수정
		book1[0].setAuthor("박완서");
		System.out.println("=========book1=========");
		for(int i=0; i<book1.length; i++) {
			book1[i].showBookInfo();}
		
		System.out.println("=========book2=========");
		for(int i=0; i<book2.length; i++) {
			book2[i].showBookInfo();}
		//값이 바뀜
		
		
	}////main
}////class
