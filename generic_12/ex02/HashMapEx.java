package generic_12.ex02;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		dic.put("mom", "엄마");
		dic.put("friend", "친구");
		dic.put("mars", "화성");
		dic.put("science", "과학");
		dic.put("bisket", "비스켓");
		
		while(true) {
			System.out.println("단어를 입력하세요");
			String w = sc.next();
			if(w.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;}
			String kor = dic.get(w);
			if(kor==null) {System.out.println("검색 결과가 없습니다.");}
			else {System.out.println(kor);}
			System.out.println("==============");
		}
		
		sc.close();
		
		
	}/////main
}///////class
