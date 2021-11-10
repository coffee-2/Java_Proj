package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	/*
	HashSet : ������� ������� ����(������� ��µ��� ����)
			  �ߺ��� ���� ������ �� ����(���̵�, �ֹι�ȣ, �ֹ���ȣ ��)
			  	[ equals() �޼ҵ� ������ �ʿ�]
			  ��� �Ҷ�, ������ ���� Iterator ���
	*/

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("�ӵ���");
		hset.add("�ִ�ä");
		hset.add("������");
		hset.add("�����");
		
		
		System.out.println(hset);
		System.out.println("================");
		
		Iterator<String> ir = hset.iterator();
		while(ir.hasNext()) {System.out.println(ir.next());}
		System.out.println("================");
		
		hset.remove("�ִ�ä");
		System.out.println(hset);
		
		
		
	}//main
}/////class
