package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Member;

public class MemberTreeSet {
	
	private TreeSet<Member> tset;
	
	public MemberTreeSet() {tset = new TreeSet<Member>();}
	
	public void addMember(Member member) {tset.add(member);}
	
	public boolean removeMember(int id) {
		Iterator<Member> ir = tset.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int x = member.getId();
			if(x==id) {
				tset.remove(member);
				return true;}
		}
		System.out.println("�ش� ID�� �������� �ʽ��ϴ�.");
		return false;
	}

	public void showAllMember() {
		System.out.println("for������ ���");
		for(Member m : tset) {System.out.println(m);}
		System.out.println("===================================");
		
		System.out.println("Iterator�� ���");
		Iterator<Member> ir = tset.iterator();
		while(ir.hasNext()) {System.out.println(ir.next());}
	}
	
			
}//////class
