package ex.lamda;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2���� �Է��ϼ���");
		double x = sc.nextInt();
		double y = sc.nextInt();
		
		//1.��ü �������� ���
		Calcex cal1 = new Calcex();
		cal1.doClac(x, y);
		System.out.println("--------------------");
		
		//2.���ٽ��� �̿�
		Calc cal2 = (s, v) -> {
			System.out.println(s+"+"+v+"="+(s+v));
			System.out.println(s+"-"+v+"="+(s-v));
			System.out.println(s+"*"+v+"="+(s*v));
			try {System.out.println(s+"/"+v+"="+(double)(s/v));}
			catch(ArithmeticException e) {
				System.out.println(e+"\r\n0���� ���� �� �����ϴ�.");}
		};
		cal2.doClac(x, y);
		System.out.println("--------------------");
		
		//3.�͸� ���� Ŭ���� ���
		Calc cal3 = new Calc() {

			@Override
			public void doClac(double x, double y) {
				System.out.println(x+"+"+y+"="+(x+y));
				System.out.println(x+"-"+y+"="+(x-y));
				System.out.println(x+"*"+y+"="+(x*y));
				try {System.out.println(x+"/"+y+"="+(double)(x/y));}
				catch(ArithmeticException e) {
					System.out.println(e+"\r\n0���� ���� �� �����ϴ�.");}
			}
		};
		cal3.doClac(x, y);
			
		sc.close();
		
		
	}//////main
}/////////class
