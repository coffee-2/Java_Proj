package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
			// 1. �����ؼ� ����(��������). ��µ� ���ĵǾ� ��µ�
			// 2. �ߺ��� �� ����ȵ�.
			// 3. Comparable<������ Ÿ��> �������̽��� implements ���Ѿ� �Ѵ�. 
			//    [compareTo() �޼ҵ� ������!] <<����>>
			// 	  equals() �޼ҵ� ������ �ʿ�.  <<�ߺ�����>>
	
	
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("������");
		tset.add("������");
		tset.add("��ä��");
		
		System.out.println(tset);
		System.out.println("==================");
		
		tset.add("D");
		tset.add("Z");
		tset.add("A");
		tset.add("R");
		tset.add("K");
		tset.add("U");
		
		for(String s : tset) {System.out.print(s+" ");}
		System.out.println();
		System.out.println("==================");
		
		
		//Iterator�� ���
		Iterator<String> ir = tset.iterator();
		while(ir.hasNext()) {System.out.print(ir.next()+" ");}
		
		
	}/////main
}////////class
