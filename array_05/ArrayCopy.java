package array_05;

public class ArrayCopy {  //배열의 복사, 배열은 초기에 배열방의 갯수가 선언되고 
						  //자동으로 늘어나지 않음.
						  //배열에 더 많은 정보를 넣기 위해서는 새로운 배열을 만들고 
						  //기존 배열의 값을 복사.

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5};
		int[] arr3 = new int[10];
		int[] arr4 = new int[20];
		
		System.arraycopy(arr1, 0, arr2, 1, 4);
		System.arraycopy(arr2, 0, arr3, 0, 5);
		System.arraycopy(arr1, 2, arr4, 0, 3);
//복사할 배열 이름, 복사를 시작할 위치, 붙여넣을 배열 이름, 붙여넣기 시작할 위치, 붙여넣을 개수
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);}
		System.out.println("=========================");
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);}
		System.out.println("=========================");
		arr3[5] = 500;
		arr3[6] = 600;
		arr3[7] = 700;
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);}
		System.out.println("=========================");
		
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);}
		
		
		
		
		
	}/////main
}/////class