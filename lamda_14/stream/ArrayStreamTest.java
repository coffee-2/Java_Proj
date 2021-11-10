package lamda_14.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStreamTest {

	public static void main(String[] args) {
		int arr[] = {94, 87, 69, 72, 59};
		
		Arrays.stream(arr).forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("for문 사용");
		for(int i=0; i<arr.length; i++) {System.out.print(arr[i]+ " ");}
		System.out.println();
		System.out.println();
		
		System.out.println("스트림을 사용해서 합계 구하기");
		int sum = Arrays.stream(arr).sum();
		System.out.println("합계 : "+sum);
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(17);
		list.add(103);
		list.add(287);
		list.add(57);
		
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println("합계2 : "+sum2);
		
		
		
	}//main
}////class
