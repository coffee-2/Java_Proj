package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
			// 1. 정렬해서 저장(오름차순). 출력도 정렬되어 출력됨
			// 2. 중복된 값 저장안됨.
			// 3. Comparable<데이터 타입> 인터페이스를 implements 시켜야 한다. 
			//    [compareTo() 메소드 재정의!] <<정렬>>
			// 	  equals() 메소드 재정의 필요.  <<중복저장>>
	
	
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("노지선");
		tset.add("박지원");
		tset.add("이채영");
		
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
		
		
		//Iterator로 출력
		Iterator<String> ir = tset.iterator();
		while(ir.hasNext()) {System.out.print(ir.next()+" ");}
		
		
	}/////main
}////////class
