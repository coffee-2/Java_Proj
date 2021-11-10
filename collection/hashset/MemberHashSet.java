package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	
	private HashSet<Member> mset;
	
	public MemberHashSet() {mset = new HashSet<Member>();}
	
	public void addMember(Member member) {mset.add(member);}
	
	public boolean removeMember(int id) {
		Iterator<Member> ir = mset.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();  //get()
			int x = member.getId();
			if(x==id) {
				mset.remove(member);
				return true;}
		}
		System.out.println("해당 ID가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member m : mset) {System.out.println(m);}
	}
	
	
}
