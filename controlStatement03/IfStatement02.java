package controlStatement03;

import java.io.IOException;

public class IfStatement02 {
	public static void main(String[] args) throws IOException {
		int num1=100;
		System.out.println("[if문 형식 첫번째로 짝/홀수 판단]");
		if(num1%2==0) System.out.println("짝수");
		if(num1%2!=0) System.out.println("홀수");
		
		System.out.println("[if문 형식 두번째로 짝/홀수 판단]");
		if(num1%2==0) System.out.println("짝수");
		else System.out.println("홀수");
		
		
		
		System.out.println("[삼항 연산자로 짝/홀수 판단]");
		String result = num1%2==0? "짝수":"홀수";
		System.out.println(result);
		
		num1=100;
		System.out.println("[짝/홀수 판단 후 짝수인 경우 100이상인지 판단 if~else]");
		if(num1%2==0) {
		if(num1>=100) System.out.println("짝수 이면서 100이상");
		else System.out.println("짝수 이면서 100미만");

		}
		num1=27;
		System.out.println("[짝/홀수 판단 후 짝수인 경우 100이상인지 판단 삼항 연산자]");
		System.out.println(num1%2==0? (num1>=100? "짝수 이면서 100이상":"짝수 이면서 100미만"):"홀수");
		
		if(num1%2 !=0)  {
			System.out.println("num1은"+num1);
			System.out.println(num1+"은 홀수");
		}
		else System.out.println(num1+"은 짝수%n%n%n");
		
		System.out.println("숫자를 입력하세요.");
		char word = (char)System.in.read();
		if(word>='0' && word<='9') {
			System.out.println("숫자입니다.");}
			else {System.out.println("숫자가 아닙니다.");}
		System.out.println(word>='0' && word<='9'? "숫자입니다.":"숫자가 아닙니다.");
		
		
		
		System.in.skip(2);
		System.out.println("다시 한 문자를 입력하세요.");
		word = (char)System.in.read();
		if(word>='0' && word<='9') {
			if((word-'0')%2==0) {System.out.println("2의 배수");}
			else System.out.println("2의 배수가 아님");
		}
		else {
			if(word>='A' && word<='Z') System.out.println("대문자");
			else System.out.println("소문자");
		}
	
}
	/*System.in.skip(2); [내가 한거]
	System.out.println("다시 한 문자를 입력하세요.");
	word = (char)System.in.read();
	if(word>='0' && word<='9') {
		System.out.println("숫자입니다.");}
	else {System.out.println("숫자가 아닙니다.");}
	System.out.println(word%2==0? "숫자이면서 2의 배수" : "숫자이면서 2의 배수가 아님");
	if(word>='A' && word<='Z') {
		System.out.println("대문자");
	}
	if(word>='a' && word<='z') {
		System.out.println("소문자");
	}
*/
}
