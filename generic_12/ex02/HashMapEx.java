package generic_12.ex02;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		dic.put("mom", "����");
		dic.put("friend", "ģ��");
		dic.put("mars", "ȭ��");
		dic.put("science", "����");
		dic.put("bisket", "����");
		
		while(true) {
			System.out.println("�ܾ �Է��ϼ���");
			String w = sc.next();
			if(w.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;}
			String kor = dic.get(w);
			if(kor==null) {System.out.println("�˻� ����� �����ϴ�.");}
			else {System.out.println(kor);}
			System.out.println("==============");
		}
		
		sc.close();
		
		
	}/////main
}///////class
