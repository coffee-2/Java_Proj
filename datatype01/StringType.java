package datatype01;

public class StringType {

	public static void main(String[] args) {
		int number;
		number = 99;
		
		String strNumber1= "99";
		String strNumber2= "100";
		System.out.println(strNumber1 + strNumber2);
		
	    String newString = new String("������");
	    System.out.println(newString);
	    String stringLikeBasic = "�����";
	    System.out.println(stringLikeBasic);
	    
	    String plusString;
	    plusString = newString + stringLikeBasic;
	    System.out.println(plusString);
	    
	    int kor=100, eng=100, math=100;
	    System.out.println("����:"+kor+eng+math);
		System.out.println("����:"+(kor+eng+math));
	}

}
