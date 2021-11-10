package controlStatement03;

import java.io.IOException;

public class IfStatement01 {
	public static void main(String[] args) throws IOException  {
		int num=10;
		if(num%2==0) {System.out.printf("%s: 짝수%n",num);};
		
		int num1=10;
		if(num1%2!=0) {System.out.printf("%s: 홀수%n",num1);};
		
		if(num1%2!=0 && num1>=9) {System.out.printf("%d: 홀수이고 9보다 크거나 같은 수이다%n",num1);};
		
		if(true) System.out.println("항상 실행되는 명령문");
		if(false) System.out.println("절대로 실행이 안되는 명령문");
		
		if(num1%2 !=0)// ;붙이지 않게 조심
			{System.out.printf("%d는 홀수%n",num1);}
		
		if(num1%2==0) System.out.printf("%d는 짝수%n",num1);
	
		num1=9;
		if(num1%2!=0) {System.out.printf("num1은 %d이다%n",num1);
					   System.out.printf("%d는 홀수이다.%n",num1);
					   System.out.printf("그러므로 num1은 홀수이다%n");}
		
		
		/*System.out.println("1. 한 문자를 입력하세요.");
		int asciicode = System.in.read();
		System.out.println("사용자가 입력한 문자의 아스키 코드값:"+asciicode);
		System.out.println("사용자가 입력한 문자의 아스키 코드값:"+(char)asciicode);
		
		//사용자가 입력한 문자가 숫자인지 아닌지를 판단
		//1]아스키 코드값을 알 때
		boolean isNumber = asciicode>=48 && asciicode <=57;
		if(isNumber) System.out.println("입력한 문자는 숫자입니다.");
		if(!isNumber) System.out.println("입력한 문자는 숫자가 아닙니다.");
		
		//2]아스키 코드값을 모를 때
		isNumber = asciicode>='0' && asciicode <='9';
		if(isNumber) System.out.println("입력한 문자는 숫자입니다.");
		if(!isNumber) System.out.printf("입력한 문자는 숫자가 아닙니다.%n%n%n");
		*/
		
		

		
		System.out.println("숫자를 입력하세요.");
		int word;
		word = (int)System.in.read();
		//1]if문 안의 if문으로 처리
		if(word>='0'&&word<='9') {
			if(word%2==0) System.out.println("2의 배수입니다.");
			if(word%2==1) System.out.println("2의 배수가 아닙니다.");
		}
		
				
		
		
		
		
	}
}
