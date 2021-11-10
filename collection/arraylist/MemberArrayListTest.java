package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList ml = new MemberArrayList();
		
		Member Lee = new Member(1001, "이정훈");
		Member Son = new Member(1004, "손기준");
		Member Park = new Member(1003, "박채진");
		Member Kim = new Member(1002, "김수진");
		Member Son2 = new Member(1004, "손주완");
		Member Park2 = new Member(1005, "박기태");
		
		ml.addMember(Lee);
		ml.addMember(Son);
		ml.addMember(Park);
		ml.addMember(Kim);
		ml.addMember(Son2); //ArrayList는 중복된 값을 저장할 수 있다.
		
		ml.addMember2(3, Park2);
		
		ml.showAllMember();
		System.out.println("===========================");
		
		System.out.println(Son.equalss(Lee));
		System.out.println(Son.equalss(Son2));
		System.out.println("===========================");
		
		ml.removerMember(1003);
		ml.removerMember(Lee.getId());
		ml.showAllMember();
		
	}///main
}/////class
