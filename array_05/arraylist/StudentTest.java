package array_05.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(30414, "이도진");
		Lee.addSubject("국어", 100);
		Lee.addSubject("수학", 65);
		Lee.addSubject("영어", 98);
		
		Student Kim = new Student(30928, "김송일");
		Kim.addSubject("국어", 68);
		Kim.addSubject("수학", 100);
		Kim.addSubject("영어", 96);
		
		Lee.showStudentInfo();
		System.out.println("==================================");
		Kim.showStudentInfo();
		System.out.println("==================================");
		
		Student Park = new Student(30217, "박상준");
		Park.addSubject("국어", 100);
		Park.addSubject("수학", 96);
		Park.addSubject("영어", 97);
		Park.addSubject("세계사", 47);
		Park.addSubject("법과정치", 46);
		
		Park.showStudentInfo();
		
		
	}////main
}//////class
