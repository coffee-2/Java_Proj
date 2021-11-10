package lamda_14.lamda;

public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber max = (x,y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(16, 73));
		
		MyNumber2 min = (x,y) -> (x <= y) ? x : y;
		System.out.println(min.getMin(24, 23));
		
		
	}///////main
}/////////class
