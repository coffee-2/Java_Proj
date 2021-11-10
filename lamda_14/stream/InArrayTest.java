package lamda_14.stream;

import java.util.Arrays;

public class InArrayTest {

	public static void main(String[] args) {
		
		int arr[] = {19, 47, 88, 1022, 79};
		
		/*
		int sum1 = 0;
		for(int i=0; i<arr.length; i++) {sum1 += arr[i];}
		System.out.println(sum1);
		*/
		
		//�迭�� ��Ʈ�� ��� : Arrays.stream(arr)
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		double avg = Arrays.stream(arr).average().getAsDouble();
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("sum : "+sum);
		System.out.println("�迭�� ���� : "+count);
		System.out.println("avg : "+avg);
		System.out.println("�ּڰ� : "+min);
		System.out.println("�ִ밪 : "+max);
		
		
		
	}//main
}////class
