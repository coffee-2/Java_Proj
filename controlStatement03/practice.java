package controlStatement03;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int fnum=sc.nextInt();
		int a=fnum;
		System.out.printf("결과%n");
		/*if(a==1) {System.out.println("많이 좋아하지 않는다");}
		else if(a==2) {System.out.println("좋아하지 않는다");}
		else if(a==3) {System.out.println("보통이다");}
		else if(a==4) {System.out.println("좋아한다");}
		else{System.out.println("많이 좋아한다");}*/
		
		
		switch(a) {
		case 1: System.out.printf("종범이는 오늘 게임을 별로 하고싶지 않다%n%n");
				
			break;
		case 2: System.out.printf("종범이는 오늘 게임을 그닥 하고싶지 않다%n%n");
				
			break;
		case 3: System.out.printf("종범이는 오늘 게임을 보통 정도로 하고싶어 한다%n%n");
				
			break;
		case 4: System.out.printf("종범이는 오늘 게임을 하고싶어 한다%n%n");
				
			break;
		default: System.out.printf("종범이는 오늘 게임을 무지막지하게 하고싶어 한다%n%n");}
	
	
	
	
	}





}
				 
		
		
		


