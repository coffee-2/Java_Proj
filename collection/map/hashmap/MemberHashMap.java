package collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class MemberHashMap {
			// HashMap<Key, Values>
	
	HashMap<Integer, Member> hmap;
	
	public MemberHashMap() {hmap = new HashMap<Integer, Member>();}
	
	public void addMember(Member member) {hmap.put(member.getId(), member);}
	
	public boolean removeMember (int id) {
		if(hmap.containsKey(id)) {	//HasshMap에서 검색할 때 key를 사용해서 검색
									// containsKey() :  키 값을 검색하는 메소드
			hmap.remove(id);		//HashMap에서는 Key를 삭제하면 Key-value가 삭제됨
			return true;}
		System.out.println("해당 ID '"+id+"' 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		System.out.println("for문을 사용해 출력");
		for(Integer i : hmap.keySet()) {
			Member member = hmap.get(i);
			System.out.println(member);}
		System.out.println();
		
		System.out.println("Iterator를 사용해 출력");
		Iterator<Integer> ir = hmap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hmap.get(key);  // get(key) : key에 해당하는 value 값을 가져옴
			System.out.println(member);
		}
		System.out.println();
	}
	
}
