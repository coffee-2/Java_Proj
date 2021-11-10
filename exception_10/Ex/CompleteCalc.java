package exception_10.Ex;

import java.util.Scanner;

public class CompleteCalc extends Calculator implements Calc{

	@Override
	public int add(int a, int b) {return a+b;}

	@Override
	public int times(int a, int b) {return a*b;}

	@Override
	int sub(int a, int b) {return a-b;}

	@Override
	int div(int a, int b) {return a/b;}
	
	@Override
	public String toString() {
		return "합은 :"+add(a,b)+" 뺀값 : "+sub(a,b)+" 곱한값 : "+times(a,b)
		+" 나눈값 : "+div(a,b);}
	
	
	public CompleteCalc() {}
	
	int a,b;
	public void CompleteClac(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("=====결과=====");
		System.out.println(a+" + "+b+" = "+add(a,b));
		System.out.println(a+" - "+b+" = "+sub(a,b));
		System.out.println(a+" x "+b+" = "+times(a,b));
		try {System.out.println(a+" / "+b+" = "+div(a,b));}
		catch(ArithmeticException e) {
			System.out.println(e+" (0으로 나눌 수 없습니다.)");}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CompleteCalc com = new CompleteCalc();
		
		System.out.println("변수 a 값을 입력하세요 >>");
		int a = sc.nextInt();
		System.out.println("변수 b 값을 입력하세요 >>");
		int b = sc.nextInt();
		com.CompleteClac(a, b);
		
		/*
		CompleteCalc calc = new CompleteCalc(a, b);
			System.out.println(calc.add(a, b));
			System.out.println(calc.sub(a, b));
			System.out.println(calc.times(a, b));
		try {System.out.println(calc);}
		catch(ArithmeticException e) {}
		System.out.println("프로그램 종료");
		*/
		
		sc.close();
		
	}//main
}///////class
