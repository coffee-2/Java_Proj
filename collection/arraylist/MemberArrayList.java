package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> ml;
	public MemberArrayList() {ml = new ArrayList<Member>();}
	
	public void addMember(Member member) {ml.add(member);}
	
	public void addMember2(int x, Member member) {
		ml.add(x, member); //특정 인덱스 방에 값을 추가하는 것
	}
	
	public boolean removerMember(int id) {
		
		//for문 사용
		/*
		for(int i=0; i<ml.size(); i++) { //모든 방을 검색해서 해당 id를 가진 객체를 찾음
			Member member = ml.get(i);	 //각 방의 객체를 가져와서 member 변수에 할당
			int tempid = member.getId(); //객체의 저장된 id값을 가져와 tempid에 할당
			if(tempid==id) {
				ml.remove(i);	//방 번호로 삭제
				return true;}		
		}*/
		
		//Iterator 사용
		Iterator<Member> ir = ml.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int x = member.getId();
			if(x==id) {
				ml.remove(member);	//객체 이름으로 삭제
				return true;}
		}
		
		System.out.println(id+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		//for(Member member : ml) {System.out.println(member);}
		for(int i=0; i<ml.size(); i++) {
			Member member = ml.get(i);
			System.out.println(member+" index "+i);
			//System.out.println(ml.get(i)+" index "+i);
		}
	}
	
	
}//////class
