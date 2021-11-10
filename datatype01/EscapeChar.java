package datatype01;

public class EscapeChar {

	public static void main(String[] args) {
		// \t는 tap키 처럼
		System.out.println("Hit HomeRun");
		System.out.println("Hit\t HomeRun");
		// \n은 줄바꿈
		System.out.println("Hit\nHomeRun");
		System.out.println("\nHit HomeRun");
		// \r은 한줄만 띄고
		System.out.println("Hit HomeRun");
		
		System.out.println("=====================================================");
		System.out.printf("%25s%n", "성적표");
		System.out.println("=====================================================");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%s%n","name","kor","eng","math","total","avg");
		System.out.println("=====================================================");
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%.2f%n","HONG","95","70","90",95+70+90,(95+70+90)/3.0);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%.2f%n","KIM","90","85","80",90+85+80,(90+85+80)/3.0);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%.2f%n","PARK","85","98","97",85+98+97,(85+98+97)/3.0);

	}

}
