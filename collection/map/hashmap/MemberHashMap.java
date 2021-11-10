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
		if(hmap.containsKey(id)) {	//HasshMap���� �˻��� �� key�� ����ؼ� �˻�
									// containsKey() :  Ű ���� �˻��ϴ� �޼ҵ�
			hmap.remove(id);		//HashMap������ Key�� �����ϸ� Key-value�� ������
			return true;}
		System.out.println("�ش� ID '"+id+"' �� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		System.out.println("for���� ����� ���");
		for(Integer i : hmap.keySet()) {
			Member member = hmap.get(i);
			System.out.println(member);}
		System.out.println();
		
		System.out.println("Iterator�� ����� ���");
		Iterator<Integer> ir = hmap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hmap.get(key);  // get(key) : key�� �ش��ϴ� value ���� ������
			System.out.println(member);
		}
		System.out.println();
	}
	
}
