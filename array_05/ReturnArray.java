package array_05;

public class ReturnArray {
	static int[] mArry() {
		int temp[] = new int[4]; //정수형 배열 4개 생성
		for(int i=0; i<temp.length; i++) {  //for문을 사용해 각방에 정수값 입력
			temp[i] = i;}
		return temp;}
	
	
	
	public static void main(String[] args) {
		int[] intarr;
		intarr = mArry();
		for(int i=0; i<intarr.length; i++) {
			System.out.print(intarr[i] + " ");}
		
		intarr[0] = 5;
		intarr[1] = 6;
		intarr[2] = 7;
		intarr[3] = 8;
		for(int a : intarr) {
			System.out.print(a + " ");}
		
	}/////main
}////////class
