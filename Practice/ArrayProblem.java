package Practice;

import java.util.Scanner;

public class ArrayProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int intarr[] = new int[a];
		System.out.println("���� �ϳ��� �Է��ϼ���.");
		a = sc.nextInt();
		sc.close();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println(a + "���� ������ �Է��ϼ���.");
		for(int i=0; i<intarr.length; i++) {
			intarr[i] = sc1.nextInt();
			int sum = 0;
			sum += intarr[i];
			double avg = sum/intarr.length;
			for(int x : intarr) {System.out.println(x + "\r\n��� : " + avg);}
		}
		sc1.close();
		
		

		
		
		
		
	}////main
}////////class
