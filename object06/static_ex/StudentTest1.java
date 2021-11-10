package object06.static_ex;

public class StudentTest1 {
public static void main(String[] args) {
		
		Student Kim = new Student ();
		Kim.setname("김두환");
		System.out.println(Kim.serialNum);//媛앹껜 �깮�꽦 �썑 static 硫ㅻ쾭 異쒕젰
		Kim.serialNum ++;
		
	
		
		Student Lee = new Student();
		Lee.setname("이명박");
		System.out.println(Lee.serialNum);
		Lee.serialNum ++;
		
		System.out.println();
		
		System.out.println(Student.serialNum);//媛앹껜 �깮�꽦 �뾾�씠 static 硫ㅻ쾭 異쒕젰
											  //class�씠由�. �쑝濡� 諛붾줈 �샇異� 媛��뒫
		Student.serialNum++;
		
		System.out.println();
		
		System.out.println(Student.getserialNum());
		
		
		
		
		
	}///main
}
