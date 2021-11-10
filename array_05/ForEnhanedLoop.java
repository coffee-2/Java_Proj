package array_05;

public class ForEnhanedLoop {

	public static void main(String[] args) {
		String[] arr1 = {"java", "android", "C", "javascript", "python"};
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);}
		System.out.println("=========Enhanced for=========");
		
		for(String lang : arr1) { //마지막 까지 출력
			System.out.println(lang);}
		
		
		
		
		
		
		
	}///main
}////class
