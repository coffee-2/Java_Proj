package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet tset = new  MemberTreeSet();
		
		Member Park = new Member(1001, "������");
		Member Lee = new Member(1002, "�̴���");
		Member Son = new Member(1003, "�յ�ȯ");
		Member Kim = new Member(969, "�����");
		Member Song = new Member(982, "�۾���");
		Member Son2 = new Member(1003, "�յ�ȯ");
		
		tset.addMember(Park);
		tset.addMember(Lee);
		tset.addMember(Son);
		tset.addMember(Song);
		tset.addMember(Kim);
		tset.addMember(Son2);
		
		tset.showAllMember();
		
		
		
	}/////main
}/////////class
