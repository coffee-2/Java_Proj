package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member;

	/*
	 * TreeMap : 1. Key-value ������ ����. Key�� �ߺ��� ���� ���� �� ����. value�� ����
	 * 			 2. Tree�� �����ؼ� ���� �� ���.
	 * 			 <<Comparable �������̽��� compareTo() �޼ҵ� ������ �ʿ�>>
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
		System.out.println("�ش� ID�� �������� �ʽ��ϴ�.");
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
