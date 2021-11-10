package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise09 {
	
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		Student Kim = new Student("김길수");
		Student Lee = new Student("이봉주");
		Student Park = new Student("박상준");
		slist.add(Kim);
		slist.add(Lee);
		slist.add(Park);
		
		boolean run = true;
		int scores[] = new int[slist.size()];
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택>>");
			int sel = sc.nextInt();
			
			if(sel==1) {
				System.out.println("학생 수>>");
				System.out.println(slist.size()+"명");}
				
			else if(sel==2) {
				System.out.println("점수를 입력하세요>>");
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
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
			}
			else if(sel==5) {run = false;}
		}
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
	}////main
}///////class
