package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member;

	/*
	 * TreeMap : 1. Key-value 쌍으로 저장. Key는 중복된 값을 넣을 수 없음. value는 가능
	 * 			 2. Tree는 정렬해서 저장 및 출력.
	 * 			 <<Comparable 인터페이스의 compareTo() 메소드 재정의 필요>>
	 * 
	 */
	
		

public class MemberTreeMap {
	TreeMap<Integer, Member> tmap;
	
	public MemberTreeMap() {tmap = new TreeMap<Integer, Member>();}
	
	public void addMember(Member member) {tmap.put(member.getId(), member);}
	
	public boolean removerMember(int id) {
		if(tmap.containsKey(id)) {
			tmap.remove(id);
			return true;}
		System.out.println("해당 ID가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		/*
		for(Integer i : tmap.keySet()) {
			Member member = tmap.get(i);
			System.out.println(member);}
		*/
		
		Iterator<Integer> ir = tmap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = tmap.get(key);
			System.out.println(member);}
	}
	
	
}
