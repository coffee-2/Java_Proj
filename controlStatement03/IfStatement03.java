package controlStatement03;

import java.io.IOException;

public class IfStatement03 {
	public static void main(String[] args) throws IOException {
		int kor=99, eng=80, math=89;
		double avg=(kor+eng+math)/3.0;

		if(avg>=90) System.out.println("A학점");
		else if(avg>=80) System.out.println("B학점");
		else if(avg>=70) System.out.println("C학점");
		else if(avg>=60) System.out.println("D학점");
		else System.out.println("F학점%n%n%n");
		
		
		//System.out.println("한 문자를 입력하세요.");
		//char word = (char)System.in.read();
		//if (word>='0' && word<='9' && (word-'0')%2==0) System.out.println("숫자이면서 2의 배수");
	    //else if(word>='0' && word<='9' && (word-'0')%2!=0) System.out.println("숫자 이면서 2의 배수가 아님");
		//else if(word>='A' && word<='Z') {System.out.println("대문자");}
		//else System.out.println("소문자");
		
		/*[내가 한거]
		 * System.out.println("한 문자를 입력하세요.");
		char word = (char)System.in.read();
		if(word>='0' && word<='9') {
			if((word-'0')%2==0) {System.out.println("2의 배수");}
			else System.out.println("2의 배수가 아님");
		}
		else if(word>='A' && word<='Z') {System.out.println("대문자");}
		else System.out.println("소문자");
		*/
		
		
		System.out.println("다른 한 문자를 입력하세요.");
		char a = (char)System.in.read();
		if(a>='0' && a<='9') {System.out.println("숫자");}
		else if(a>='A' && a<='Z' || a>='a' && a<='z') {System.out.println("알파벳");}
		else {System.out.println("기타");}
		
		/* [내가 한거]
		System.out.println("다른 한 문자를 입력하세요.");
		char word1 = (char)System.in.read();
		if(word1>='0' && word1<='9') {System.out.println("숫자");}
		else if(word1>='A' && word1<='Z' || word1>='a' && word1<='z') {System.out.println("알파벳");}
		else {System.out.println("기타");}
		*/
		
		
		
		
		
		
		int num1=49, num2=278, num3=90;
		
		if(num1>num2 && num2>num3) {System.out.println("최대값:"+num1);}
		else if(num2>num3 && num3>num1) {System.out.println("최대값:"+num2);}
		else {System.out.println("최대값:"+num3);}
		//if(num1>num2 || num1>num3 || num2>num3) {System.out.println("최대값:"+num1);}
		
		
		
		
		
		
		
		
	}//main
}////class
