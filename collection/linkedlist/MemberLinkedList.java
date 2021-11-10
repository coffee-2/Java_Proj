package collection.linkedlist;

import java.util.LinkedList;

import collection.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> list;
	
	public MemberLinkedList() {list = new LinkedList<Member>();}
	
	public void addMember(Member member) {list.add(member);}
	
	public void addMember2(int a, Member member) {list.add(a, member);}
	
	public boolean removeMember(int id) {
		for(int i=0; i<list.size(); i++) {
			Member member = list.get(i);
			int x = member.getId();
			if(x==id) {
				list.remove(i);
				return true;
			}
		}
		System.out.println("아이디가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(int i=0; i<list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member+" index "+i);}
		//for(Member member : list) {System.out.println(member);}
	}
	
	
}////class
