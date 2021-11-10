package array_05;

public class ObjectCopy3 {//배열의 깊은 복사
						  //원본 배열의 값이 바뀌더라도 복붙한 배열의 값은 바뀌지 않는다.

	public static void main(String[] args) {
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("태백산맥", "조정래");
		book1[1] = new Book("순수이성비판", "칸트");
		book1[2] = new Book("데미안", "헤르만 헤세");
		
		book2[0] = new Book();		//객체를 직접 생성 후 복사
		book2[1] = new Book();
		book2[2] = new Book();
		
		for(int i=0; i<book1.length; i++) {
			book2[i].setBookName(book1[i].getBookName());;
			book2[i].setAuthor(book1[i].getAuthor());}
		
		for(int i=0; i<book2.length; i++) {
			book2[i].showBookInfo();}
		
		book1[0].setBookName("나목"); //원본을 수정
		book1[0].setAuthor("박완서");
		
		System.out.println("===========book1============");
		for(int i=0; i<book1.length; i++) {
			book1[i].showBookInfo();}
		
		System.out.println("===========book2============");
		for(int i=0; i<book2.length; i++) {
			book2[i].showBookInfo();}
		//값이 바뀌지 않음
		
		
		
		
	}///main
}////class
