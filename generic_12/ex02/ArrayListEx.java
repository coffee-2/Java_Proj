package generic_12.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println("�̸��� �Է��ϼ���.");
			String name = sc.next();
			a.add(name);}
		
		for(int i=0; i<a.size(); i++) {
			String n = a.get(i);
			System.out.print(n + ". ");}
		System.out.println();
		
		int longname = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(longname).length() < a.get(i).length()) {longname = i;}
		}
		System.out.println("���� �� �̸��� "+a.get(longname)+" �Դϴ�.");
		
		System.out.println("=============�� ���� ���� ���̴�=============");
		System.out.println(a.get(0)+" �� ���� ���̴� "+a.get(0).length());
		System.out.println(a.get(1)+" �� ���� ���̴� "+a.get(1).length());
		System.out.println(a.get(2)+" �� ���� ���̴� "+a.get(2).length());
		System.out.println(a.get(3)+" �� ���� ���̴� "+a.get(3).length());
		
		sc.close();
		
		
	}//main
}///////class
