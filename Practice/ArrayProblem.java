package Practice;

import java.util.Scanner;

public class ArrayProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int intarr[] = new int[a];
		System.out.println("숫자 하나를 입력하세요.");
		a = sc.nextInt();
		sc.close();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println(a + "개의 정수를 입력하세요.");
		for(int i=0; i<intarr.length; i++) {
			intarr[i] = sc1.nextInt();
			int sum = 0;
			sum += intarr[i];
			double avg = sum/intarr.length;
			for(int x : intarr) {System.out.println(x + "\r\n평균 : " + avg);}
		}
		sc1.close();
		
		

		
		
		
		
	}////main
}////////class
