package array_05.twodimension;

public class IrreqularArray {

	public static void main(String[] args) {
		int arr[][] = {{10,11,12},{20,21},{30,31,32},{40,41,42,43}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf(arr[i][j] + " ");}
			System.out.println();
		}
		System.out.println("==============================");
		
		
		
		int intarr[][] = new int[4][]; //비정방형 배열 선언
		
		intarr[0] = new int[3];
		intarr[1] = new int[2];
		intarr[2] = new int[3];
		intarr[3] = new int[4];
		
		for(int i=0; i<intarr.length; i++) { //배열의 각 방에 값을 입력
			for(int j=0; j<intarr[i].length; j++) {
				intarr[i][j] = (i+1) * 10 + j;}
		}
		
		for(int i=0; i<intarr.length; i++) { //배열의 각 방의 값을 출력
			for(int j=0; j<intarr[i].length; j++) {
				System.out.printf(intarr[i][j] + " ");}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}/////main
}///////class
