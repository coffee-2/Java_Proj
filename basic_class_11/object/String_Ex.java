package basic_class_11.object;

public class String_Ex {

	public static void main(String[] args) {
		//String, Integer, boolean 은 toString() 메소드가 재정의 되어 있음.
		//String, Integer, boolean 은 equals() 메소드가 재정의 되어 있음.
		
		
		//String을 객체화 해서 객체 변수에 저장
		String str1 = new String("김이박");
		String str2 = new String("김이박");
		System.out.println(str1);
		//System.out.println(str2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		//String을 객체화 하지 않고 변수에 저장
		String str3 = "최동진";
		String str4 = "최동진";
		System.out.println(str3);
		//System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
	}///main
}////class
