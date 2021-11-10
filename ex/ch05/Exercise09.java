package ex.ch05;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int stdnum = 0;
		int [] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택>>");
			int sel = sc.nextInt();
			
			if(sel==1) {
				System.out.println("학생 수를 입력하세요>>");
				stdnum = sc.nextInt();
				scores = new int [stdnum];}
			else if(sel==2) {
				System.out.println("점수를 입력하세요");
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = sc.nextInt();}
			}
			else if(sel==3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>" + scores[i]);}
			}
			else if(sel==4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i]) ? scores[i] : max;
					//			조건			참일 때 		거짓일때
					sum+=scores[i];}
					avg =(double)sum/scores.length;
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
			}
			else if(sel==5) {run = false;}
		}
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	
		
	}////main
}//////class
