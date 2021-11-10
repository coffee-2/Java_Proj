package ex.lamda;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요");
		double x = sc.nextInt();
		double y = sc.nextInt();
		
		//1.객체 지향으로 출력
		Calcex cal1 = new Calcex();
		cal1.doClac(x, y);
		System.out.println("--------------------");
		
		//2.람다식을 이용
		Calc cal2 = (s, v) -> {
			System.out.println(s+"+"+v+"="+(s+v));
			System.out.println(s+"-"+v+"="+(s-v));
			System.out.println(s+"*"+v+"="+(s*v));
			try {System.out.println(s+"/"+v+"="+(double)(s/v));}
			catch(ArithmeticException e) {
				System.out.println(e+"\r\n0으로 나눌 수 없습니다.");}
		};
		cal2.doClac(x, y);
		System.out.println("--------------------");
		
		//3.익명 내부 클래스 사용
		Calc cal3 = new Calc() {

			@Override
			public void doClac(double x, double y) {
				System.out.println(x+"+"+y+"="+(x+y));
				System.out.println(x+"-"+y+"="+(x-y));
				System.out.println(x+"*"+y+"="+(x*y));
				try {System.out.println(x+"/"+y+"="+(double)(x/y));}
				catch(ArithmeticException e) {
					System.out.println(e+"\r\n0으로 나눌 수 없습니다.");}
			}
		};
		cal3.doClac(x, y);
			
		sc.close();
		
		
	}//////main
}/////////class
