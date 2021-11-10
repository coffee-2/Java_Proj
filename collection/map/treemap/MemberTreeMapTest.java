package collection.map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tmap = new MemberTreeMap();
		
		Member Park = new Member(1001, "������");
		Member Song = new Member(1002, "���Ͽ�");
		Member Kim = new Member(1003, "������");
		Member Son = new Member(1004, "�ճ���");
		
		tmap.addMember(Park);
		tmap.addMember(Song);
		tmap.addMember(Kim);
		tmap.addMember(Son);
		
		tmap.showAllMember();
		System.out.println("=============================");
		
		tmap.removerMember(1003);
		tmap.removerMember(Son.getId());
		tmap.showAllMember();
		
		
		
		
		
		
	}/////main
}///////class
