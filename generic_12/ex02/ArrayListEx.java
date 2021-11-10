package generic_12.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println("이름을 입력하세요.");
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
		System.out.println("가장 긴 이름은 "+a.get(longname)+" 입니다.");
		
		System.out.println("=============각 방의 글자 길이는=============");
		System.out.println(a.get(0)+" 의 글자 길이는 "+a.get(0).length());
		System.out.println(a.get(1)+" 의 글자 길이는 "+a.get(1).length());
		System.out.println(a.get(2)+" 의 글자 길이는 "+a.get(2).length());
		System.out.println(a.get(3)+" 의 글자 길이는 "+a.get(3).length());
		
		sc.close();
		
		
	}//main
}///////class
