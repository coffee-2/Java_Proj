package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> ml;
	public MemberArrayList() {ml = new ArrayList<Member>();}
	
	public void addMember(Member member) {ml.add(member);}
	
	public void addMember2(int x, Member member) {
		ml.add(x, member); //Ư�� �ε��� �濡 ���� �߰��ϴ� ��
	}
	
	public boolean removerMember(int id) {
		
		//for�� ���
		/*
		for(int i=0; i<ml.size(); i++) { //��� ���� �˻��ؼ� �ش� id�� ���� ��ü�� ã��
			Member member = ml.get(i);	 //�� ���� ��ü�� �����ͼ� member ������ �Ҵ�
			int tempid = member.getId(); //��ü�� ����� id���� ������ tempid�� �Ҵ�
			if(tempid==id) {
				ml.remove(i);	//�� ��ȣ�� ����
				return true;}		
		}*/
		
		//Iterator ���
		Iterator<Member> ir = ml.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int x = member.getId();
			if(x==id) {
				ml.remove(member);	//��ü �̸����� ����
				return true;}
		}
		
		System.out.println(id+"�� �������� �ʽ��ϴ�.");
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
