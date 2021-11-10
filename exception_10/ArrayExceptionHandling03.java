package exception_10;

public class ArrayExceptionHandling03 {

	public static void main(String[] args) { 
		//try에서 예외가 발생되지 않을 경우 catch 블락은 작동되지 않음
		int arr[]  = new int[5];
			
		try {
			for(int i=0; i<5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);	//오류코드 출력
			System.out.println("예외처리 부분");}
			
		System.out.println("프로그램 정상 종료");
		
		
	}///main
}/////class
