package interface_08.lab02_Scheduler;

import java.io.IOException;


public class SchedulerEx {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ����� �Ҵ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : ������� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� ���� ������ �Ҵ�");
		System.out.println("���� >>");
		
		int ch = System.in.read(); //����ó�� �ʿ�
		Scheduler sc = null;
		
		if(ch == 'R' || ch == 'r') {sc = new RoundRobin();}
		else if(ch == 'L' || ch == 'l') {sc = new Leastjob();}
		else if(ch == 'P' || ch == 'p') {sc = new PriorityAllocation();}
		else {System.out.println("�������� �ʴ� ����Դϴ�.");
			  return;}
		
		sc.getNextcall();
		sc.sendcallToAgent();
		
		
	}///main
}/////class
