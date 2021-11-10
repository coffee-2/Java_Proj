package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet mset = new MemberHashSet();
		
		Member Lee = new Member(1001, "이정숙");
		Member Hong = new Member(1002, "홍덕진");
		Member Kim = new Member(1003, "김하인");
		Member Kim2 = new Member(1003, "김하인");
		Member Kim3 = new Member(1003, "김하인");
		
		mset.addMember(Hong);
		mset.addMember(Lee);
		mset.addMember(Kim);
		mset.addMember(Kim2);
		mset.addMember(Kim3);
		mset.showAllMember();
		System.out.println("============================");
		/*
		 * Set에서 객체를 저장할 때 중복된 값을 저장하지 않도록 하기 위해서는
		 * 객체의 특정 변수에 대해 equals() 메소드를 재정의 해야함!!
		 */
		
		//HashSet에서 객체 삭제
		mset.removeMember(1002);
		mset.removeMember(Kim.getId());
		mset.showAllMember();
		
		
	}/////main
}////////class
