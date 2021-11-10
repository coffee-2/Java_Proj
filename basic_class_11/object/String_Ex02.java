package basic_class_11.object;

public class String_Ex02 { //concat() : 두 문자열을 연결해서 출력. 가비지가 발생
						   //작은 양의 문자열을 연결할 때 사용.

	public static void main(String[] args) {
		
		String jStr = new String("Java ");
		String aStr = new String("Android");
		
		System.out.println(jStr);
		System.out.println("처음 문자열 주소 값-"+System.identityHashCode(jStr));
		System.out.println();
		
		jStr = jStr.concat(aStr);
		System.out.println(jStr);
		System.out.println("연결된 문자열 주소 값-"+System.identityHashCode(jStr));
		
		
	}////main
}///////class
