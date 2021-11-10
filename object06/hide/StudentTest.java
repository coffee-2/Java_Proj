package object06.hide;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "이박사"; //private 접근 제한자, 접근 불가
		studentLee.setStudentName("이박사"); //private 으로 선언된 변수에 setter를 통해
										   //변수 값 할당하기
		System.out.println("이름 출력: " + studentLee.getStudentName());
										  //getter를 통해 변수 값 불러오기
		
		
		
		
		
		
		
		
	}///main
}////class
