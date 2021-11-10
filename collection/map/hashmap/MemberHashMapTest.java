package collection.map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap hmap = new MemberHashMap();
		
		Member Lee = new Member(1001, "������");
		Member Kim = new Member(1002, "�迬��");
		Member Hong = new Member(1003, "ȫ����");
		Member Song = new Member(1004, "���ָ�");
		
		hmap.addMember(Lee);
		hmap.addMember(Kim);
		hmap.addMember(Hong);
		hmap.addMember(Song);
		
		hmap.showAllMember();
		
		System.out.println("=============================");
		hmap.removeMember(1003);
		hmap.removeMember(Song.getId());
		hmap.showAllMember();
		
		
		
	}///main
}//////class
