package object06.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// �л� �θ� ����
		Student stdKim = new Student ("Kim", "(3�г�)", 5000);
		Student stdLee = new Student ("Lee", "(1�г�)", 10000);
		Student stdPark = new Student ("Park", "(2�г�)", 50000);
		
		Bus bus6211 = new Bus (6211);
		stdKim.takeBus(bus6211);
		stdPark.takeBus(bus6211);
		
		Subway subgreen = new Subway ("2ȣ��");
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
