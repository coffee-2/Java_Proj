package interface_08.lab02_Scheduler;

import java.io.IOException;
import java.util.Scanner;


public class SchedulerEx02 {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		Scanner x = new Scanner(System.in);
		while(run) {
		System.out.println("��ȭ ����� �Ҵ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : ������� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� ���� ������ �Ҵ�");
		System.out.println("���� >>");
		
		String ch = x.next();
		if(ch.equals("�׸�")) {break;}
		Scheduler sc = null;
		
		if(ch.equals("R") || ch.equals("r")) {sc = new RoundRobin();}
		else if(ch.equals("L") || ch.equals("l")) {sc = new Leastjob();}
		else if(ch.equals("P") || ch.equals("p")) {sc = new PriorityAllocation();}
		else {System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			  return;}
		
		sc.getNextcall();
		sc.sendcallToAgent();}
		
		System.out.println("�����մϴ�.");
		x.close();
		
		
	}////main
}//////class
