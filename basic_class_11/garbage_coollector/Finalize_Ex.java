package basic_class_11.garbage_coollector;

public class Finalize_Ex {

	public static void main(String[] args) {
		Counter co = null;
		for(int i=1; i<51; i++) {
			co = new Counter(i);
			co = null;
			System.gc(); //������ �÷��� �������� ȣ��
		}
		
		
	}//main
}/////class
