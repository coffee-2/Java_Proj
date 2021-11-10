package inheritance_07.lab14_p322_p337.vehicle;

public class DriveEx {

	public static void main(String[] args) {
		Driver p = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		p.drive(bus);
		p.drive(taxi);
			
	}///main
}/////////class
