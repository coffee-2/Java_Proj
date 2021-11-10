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
		return "���� :"+add(a,b)+" ���� : "+sub(a,b)+" ���Ѱ� : "+times(a,b)
		+" ������ : "+div(a,b);}
	
	
	public CompleteCalc() {}
	
	int a,b;
	public void CompleteClac(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("=====���=====");
		System.out.println(a+" + "+b+" = "+add(a,b));
		System.out.println(a+" - "+b+" = "+sub(a,b));
		System.out.println(a+" x "+b+" = "+times(a,b));
		try {System.out.println(a+" / "+b+" = "+div(a,b));}
		catch(ArithmeticException e) {
			System.out.println(e+" (0���� ���� �� �����ϴ�.)");}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CompleteCalc com = new CompleteCalc();
		
		System.out.println("���� a ���� �Է��ϼ��� >>");
		int a = sc.nextInt();
		System.out.println("���� b ���� �Է��ϼ��� >>");
		int b = sc.nextInt();
		com.CompleteClac(a, b);
		
		/*
		CompleteCalc calc = new CompleteCalc(a, b);
			System.out.println(calc.add(a, b));
			System.out.println(calc.sub(a, b));
			System.out.println(calc.times(a, b));
		try {System.out.println(calc);}
		catch(ArithmeticException e) {}
		System.out.println("���α׷� ����");
		*/
		
		sc.close();
		
	}//main
}///////class
