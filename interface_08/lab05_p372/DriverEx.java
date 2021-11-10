package interface_08.lab05_p372;

public class DriverEx {

	public static void main(String[] args) {
		Driver d = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		d.drive(bus);
		d.drive(taxi);
		
	}//main
}//class
