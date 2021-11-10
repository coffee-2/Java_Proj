package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	/*
	HashSet : 순서대로 저장되지 않음(순서대로 출력되지 않음)
			  중복된 값을 저장할 수 없음(아이디, 주민번호, 주문번호 등)
			  	[ equals() 메소드 재정의 필요]
			  출력 할때, 삭제할 때는 Iterator 사용
	*/

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("임동진");
		hset.add("주덕채");
		hset.add("강성진");
		hset.add("나희민");
		
		
		System.out.println(hset);
		System.out.println("================");
		
		Iterator<String> ir = hset.iterator();
		while(ir.hasNext()) {System.out.println(ir.next());}
		System.out.println("================");
		
		hset.remove("주덕채");
		System.out.println(hset);
		
		
		
	}//main
}/////class
