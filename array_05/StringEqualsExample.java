package array_05;

public class StringEqualsExample {
	public static void main(String[] args) {
		String var1 = "조조";
		String var2 = "조조";
		
		if(var1==var2) {
			System.out.println("var1과 var2는 참조가 같음");}
		else System.out.println("var1과 var2는 참조가 다름");
		
		if(var1.equals(var2)) {
			System.out.println("var1과 var2는 문자열이 같음");}
		
		String var3 = new String("조조");
		String var4 = new String("조조");
		
		if(var3==var4) {
			System.out.println("var3과 var4는 참조가 같음");}
		else System.out.println("var3과 var4는 참조가 다름");
		
		if(var3.equals(var4)) {System.out.println("var3과 var4는 문자열이 같음");}
		
		
		
		
		
		
		
		
		
	}////main
}////class
