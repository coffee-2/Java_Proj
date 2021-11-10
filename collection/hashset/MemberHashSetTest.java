package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet mset = new MemberHashSet();
		
		Member Lee = new Member(1001, "������");
		Member Hong = new Member(1002, "ȫ����");
		Member Kim = new Member(1003, "������");
		Member Kim2 = new Member(1003, "������");
		Member Kim3 = new Member(1003, "������");
		
		mset.addMember(Hong);
		mset.addMember(Lee);
		mset.addMember(Kim);
		mset.addMember(Kim2);
		mset.addMember(Kim3);
		mset.showAllMember();
		System.out.println("============================");
		/*
		 * Set���� ��ü�� ������ �� �ߺ��� ���� �������� �ʵ��� �ϱ� ���ؼ���
		 * ��ü�� Ư�� ������ ���� equals() �޼ҵ带 ������ �ؾ���!!
		 */
		
		//HashSet���� ��ü ����
		mset.removeMember(1002);
		mset.removeMember(Kim.getId());
		mset.showAllMember();
		
		
	}/////main
}////////class
