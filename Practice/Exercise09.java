package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise09 {
	
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		Student Kim = new Student("����");
		Student Lee = new Student("�̺���");
		Student Park = new Student("�ڻ���");
		slist.add(Kim);
		slist.add(Lee);
		slist.add(Park);
		
		boolean run = true;
		int scores[] = new int[slist.size()];
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.println("����>>");
			int sel = sc.nextInt();
			
			if(sel==1) {
				System.out.println("�л� ��>>");
				System.out.println(slist.size()+"��");}
				
			else if(sel==2) {
				System.out.println("������ �Է��ϼ���>>");
				for(int i=0; i<slist.size(); i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = sc.nextInt();}
			}
			else if(sel==3) {
				for(Student s : slist) {System.out.println(s.showInfo());}
				System.out.println("------------");
				for(int i=0; i<scores.length; i++) {
					System.out.println(scores[i]);}
			}
			else if(sel==4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i]) ? scores[i] : max;
					sum+=scores[i];}
					avg =(double)sum/scores.length;
					System.out.println("�ְ� ���� : " + max);
					System.out.println("��� ���� : " + avg);
			}
			else if(sel==5) {run = false;}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
		
	}////main
}///////class
