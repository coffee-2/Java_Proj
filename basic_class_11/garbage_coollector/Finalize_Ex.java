package basic_class_11.garbage_coollector;

public class Finalize_Ex {

	public static void main(String[] args) {
		Counter co = null;
		for(int i=1; i<51; i++) {
			co = new Counter(i);
			co = null;
			System.gc(); //가비지 컬렉터 수동으로 호출
		}
		
		
	}//main
}/////class
