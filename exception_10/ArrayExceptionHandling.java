package exception_10;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int arr[] = new int [5];
		
		for(int i=0; i<=5; i++) { //Exception 발생.
				//ArrayIndexOutOfBoundsException : 배열의 방 번호를 넘겨버렸을 때 발생
			arr[i] = i;
			System.out.println(arr[i]);}
		
		
	}/////main
}/////////class
