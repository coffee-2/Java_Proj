package ex.ch05.add;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise09 {
	
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		
		boolean run = true;
		int stuNum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.println("����>>");
			int sel = sc.nextInt();
			
			if(sel==1) {
				System.out.println("�л� �� �Է�>>");
				stuNum = sc.nextInt();
				slist = new ArrayList<Student>(stuNum);
				System.out.println("�л� �� : "+stuNum+"��");}
				
			else if(sel==2) {
				if(stuNum ==0) {
					System.out.println("1���� ������ �л� ���� ���� �Է��ϼ���");}
				else {System.out.println("������ �Է��ϼ���>>");
					for(int i=0; i<stuNum; i++) {
						Student student = new Student();
						System.out.println((i+1)+" ��° ���� �Է�");
						student.score = sc.nextInt();
						slist.add(student); //ArrayList�� ��ü ����
						System.out.println("���� �Ϸ�");}
					}
			}
			
			else if(sel==3) {
				for(int i=0; i<slist.size(); i++) {
					System.out.println("����["+(i+1)+"] : "+slist.get(i).score+"��");}
			}
			
			else if(sel==4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for(int i=0; i<slist.size(); i++) {
					max = (max<slist.get(i).score) ? slist.get(i).score : max;
					sum+=slist.get(i).score;}
					avg =(double)sum/slist.size();
					System.out.println("�ְ� ���� : " + max);
					System.out.println("��� ���� : " + avg);
			}
			
			else if(sel==5) {run = false;}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
		
	}////main
}///////class
