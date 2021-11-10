package datatype01;

public class StringType {

	public static void main(String[] args) {
		int number;
		number = 99;
		
		String strNumber1= "99";
		String strNumber2= "100";
		System.out.println(strNumber1 + strNumber2);
		
	    String newString = new String("강아지");
	    System.out.println(newString);
	    String stringLikeBasic = "고양이";
	    System.out.println(stringLikeBasic);
	    
	    String plusString;
	    plusString = newString + stringLikeBasic;
	    System.out.println(plusString);
	    
	    int kor=100, eng=100, math=100;
	    System.out.println("총점:"+kor+eng+math);
		System.out.println("총점:"+(kor+eng+math));
	}

}
