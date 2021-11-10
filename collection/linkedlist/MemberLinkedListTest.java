package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		
		MemberLinkedList list = new MemberLinkedList();
		
		Member Lee = new Member(1001, "이새롬");
		Member Jang = new Member(1002, "장규리");
		Member Park = new Member(1003, "박지원");
		Member Song = new Member(1004, "송하영");
		
		list.addMember(Lee);
		list.addMember(Jang);
		list.addMember(Park);
		list.addMember(Song);
		
		
		list.showAllMember();
		System.out.println("============================");
		
		list.removeMember(1002);
		list.removeMember(Lee.getId());
		list.showAllMember();
		System.out.println("============================");
		
		list.addMember2(0, Song);
		list.showAllMember();
		
		
		
		
	}//main
}/////class
