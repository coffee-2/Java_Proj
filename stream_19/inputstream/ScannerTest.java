package stream_19.inputstream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println("���� : ");
		String job = sc.nextLine();
		
		System.out.println("���� : ");
		int age = sc.nextInt();
		
		System.out.println("�簢���� ���� ����");
		double width = sc.nextDouble();
		
		
		System.out.println("=================");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+job);
		System.out.println("���� : "+age);
		System.out.println(width);
		
		sc.close();
		
	}/////main
}/////////class
