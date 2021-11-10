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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택>>");
			int sel = sc.nextInt();
			
			if(sel==1) {
				System.out.println("학생 수 입력>>");
				stuNum = sc.nextInt();
				slist = new ArrayList<Student>(stuNum);
				System.out.println("학생 수 : "+stuNum+"명");}
				
			else if(sel==2) {
				if(stuNum ==0) {
					System.out.println("1번을 선택해 학생 수를 먼저 입력하세요");}
				else {System.out.println("점수를 입력하세요>>");
					for(int i=0; i<stuNum; i++) {
						Student student = new Student();
						System.out.println((i+1)+" 번째 점수 입력");
						student.score = sc.nextInt();
						slist.add(student); //ArrayList에 객체 저장
						System.out.println("저장 완료");}
					}
			}
			
			else if(sel==3) {
				for(int i=0; i<slist.size(); i++) {
					System.out.println("점수["+(i+1)+"] : "+slist.get(i).score+"점");}
			}
			
			else if(sel==4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for(int i=0; i<slist.size(); i++) {
					max = (max<slist.get(i).score) ? slist.get(i).score : max;
					sum+=slist.get(i).score;}
					avg =(double)sum/slist.size();
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
			}
			
			else if(sel==5) {run = false;}
		}
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}////main
}///////class
