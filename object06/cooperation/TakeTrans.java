package object06.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생 두명 생성
		Student stdKim = new Student ("Kim", "(3학년)", 5000);
		Student stdLee = new Student ("Lee", "(1학년)", 10000);
		Student stdPark = new Student ("Park", "(2학년)", 50000);
		
		Bus bus6211 = new Bus (6211);
		stdKim.takeBus(bus6211);
		stdPark.takeBus(bus6211);
		
		Subway subgreen = new Subway ("2호선");
		stdLee.takeSubway(subgreen);
		stdPark.takeSubway(subgreen);
		
		stdKim.showInfo();
		System.out.println();
		stdLee.showInfo();
		System.out.println();
		stdPark.showInfo();
		System.out.println();
		
		bus6211.showInfo();
		subgreen.showInfo();
		
		
	}////main
}////////class
