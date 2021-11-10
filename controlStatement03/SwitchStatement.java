package controlStatement03;

import java.io.IOException;
import java.util.Scanner;

public class SwitchStatement {
	private static final String Bronze = null;
	private static final String Sliver = null;
	private static final String Gold = null;

	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
		 
			
		/*System.out.println("숫자를 입력하세요.");
		int inputNumber=sc.nextInt();
		System.out.println("입력한 숫자:"+inputNumber);
		int remain=inputNumber%3;
		System.out.println("IF문으로 나머지값 판단");
		if(remain==0) System.out.println("나머지가 0");
		else if(remain==1) System.out.println("나머지가 1");
		else System.out.println("나머지가 2");
	
	
		System.out.println("switch문으로 나머지값 판단");
		switch(remain) {case 0: System.out.println("나머지가 0");
								break;
							case 1: System.out.println("나머지가 1");
								break;
							default : System.out.println("나머지가 2");}
		*/
	
		/*byte b=3;
		switch(b) {
			case 1: System.out.println("b에 저장된 값 1");
				break;//반드시 break; 추가해야함!
			case 2: System.out.println("b에 저장된 값 2");
				break;
			case 3: System.out.println("b에 저장된 값 3");
				break;
			case 4: System.out.println("b에 저장된 값 4");
				break;}*/
		
	
	//long ln=5; long형은 안됨!
		
	//계산기 출력
	/*System.out.println("첫번째 숫자 입력");
	int fnum=sc.nextInt();
	System.out.println("연산자 기호 입력(+,-,*,/)");
	char op=(char)System.in.read();
	System.out.println("두번째 숫자 입력");
	int snum=sc.nextInt();
	System.out.printf("결과%n");
	switch(op) {
	case '+' : System.out.printf("%d + %d = %d%n",fnum, snum,fnum+snum);
		break;
	case '-' :System.out.printf("%d - %d = %d%n",fnum, snum,fnum-snum);
		break;
	case '*' :System.out.printf("%d X %d = %d%n",fnum, snum,fnum*snum);
		break;
	case '/' :System.out.printf("%d / %d = %d%n",fnum, snum,fnum/snum);
		break;
	}*/
	
	/*System.out.println("숫자 입력");
	int inputNum = sc.nextInt();
	switch(inputNum) {
	case 1:
	case 2:
	case 100:
	case 200:
		System.out.println("1이거나 2이거나 100이거나 200중 하나");
		break;
	case 300: System.out.println("300");
	}*/
	
	
	
	//평균 구해서 학점 계산하기	 
		 
	/*System.out.println("국어 점수 입력");
	int kor = sc.nextInt();
	System.out.println("영어 점수 입력");
	int eng = sc.nextInt();
	System.out.println("수학 점수 입력");
	int math = sc.nextInt();	 
	int Num2 = (kor + eng + math)/30;
	switch(Num2) {
	case 10: 
	case 9: System.out.println("A학점"); break;
	case 8: System.out.println("B학점"); break;
	case 7: 
	case 6: System.out.println("C학점"); break;
	default : System.out.println("F학점");
	}*/
	
		 
	  
	System.out.println("국어 점수 입력");
	int kor = sc.nextInt();
	System.out.println("영어 점수 입력");
	int eng = sc.nextInt();
	System.out.println("수학 점수 입력");
	int math = sc.nextInt();
	int Num2 = (kor + eng + math)/3;
	switch(Num2) {
	case 100:
	case 99:
	case 98:
	case 97:
	case 96:
	case 95:
	case 94:
	case 93:
	case 92:
	case 91:
	case 90:
		System.out.printf("평균:"+Num2 + "%n학점:A");
		break;
	case 89:
	case 88:
	case 87:
	case 86:
	case 85:
	case 84:
	case 83:
	case 82:
	case 81:
	case 80:
	System.out.printf("평균:"+Num2 + "%n학점:B");
	break;
	case 79:
	case 78:
	case 77:
	case 76:
	case 75:
	case 74:
	case 73:
	case 72:
	case 71:
	case 70:
	case 69:
	case 68:
	case 67:
	case 66:
	case 65:
	case 64:
	case 63:
	case 62:
	case 61:
	case 60:
		System.out.printf("평균:"+Num2 + "%n학점:C");
		break;
	default : System.out.printf("평균:"+Num2 + "%n학점:F");}
	
	
	/*
	//메달 색 출력
	System.out.println("메달 색을 입력해주세요. (Gold or Silver or Bronze)");
	String medal = sc.next();
	switch(medal) {
	case "Gold" : System.out.println("금메달"); break;
	case "Silver" : System.out.println("은메달"); break;
	case "Bronze": System.out.println("동메달");
	default : System.out.println("메달이 없습니다");
	}*/
	
	
	
	
	
	
	
	}///main
}
