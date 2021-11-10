package exception_10;

public class ArrayExceptionHandling02 {

	public static void main(String[] args) {
		//try에서 예외가 발생되면 catch 블락이 작동 됨
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
		
			/*
			try {
				예외가 발생될 부분
			}
			catch(Exception코드 e) {예외 처리 부분, try내에서 예외가 발생되면 작동}
			*/
		
		
		
	}/////main
}////////class
