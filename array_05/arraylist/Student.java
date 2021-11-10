package array_05.arraylist;

import java.util.ArrayList;

public class Student {
	int ID;
	String stdname;
	ArrayList<Subject> subjectList; //선언
	//ArraryList<Subject> subjectList = new ArratyList<Subject>(); 선언과 동시에 생성
	
	public Student(int ID, String stdname) {
		this.ID = ID;
		this.stdname = stdname;
		subjectList = new ArrayList<Subject>();} //subjectList 배열 변수 생성
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		subjectList.add(subject);}
	
	public void showStudentInfo() {
		int total =0;
		for(Subject s : subjectList) {
			total += s.getScore();
		System.out.println("학생: " + stdname + "의 " + s.getName() + " 과목 성적은 "
				+ s.getScore() + "점 입니다.");}
	System.out.println("학생 " + stdname + "의 총점은 " + total + "점 입니다.");}
	
	
		







}////class
