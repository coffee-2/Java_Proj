package array_05;

public class ArrayTest {
	public static void main(String[] args) {
		int[] number = new int [] {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		number[0] = 50;
		number[1] = 60;
		number[2] = 70;
		number[3] = 80;		
		System.out.println("길이: " + number.length);
		for(int i=0; i<number.length; i++) { sum+=number[i];
			System.out.println(number[i]);}
		double avg = sum/10;
		System.out.println(sum);
		System.out.println(avg);
		System.out.println("===========================");
		System.out.println(number[0]);
		
		
		
		
		
		
		
	}///main
}
