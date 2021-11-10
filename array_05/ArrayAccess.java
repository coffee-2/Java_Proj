package array_05;
import java.util.Scanner;
public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intarr[] = new int[5];
		int max = 0;
		System.out.println("양의 정수 5개를 입력하세요.");
		
		for(int i=0; i<intarr.length; i++) {
			intarr[i] = sc.nextInt();
			if(intarr[i] > max) {max = intarr[i];}
			}
		System.out.println("제일 큰 수는 " + max + " 입니다.");
		sc.close();
		
	}///main
}/////class
