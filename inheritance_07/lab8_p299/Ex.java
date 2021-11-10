package inheritance_07.lab8_p299;

public class Ex {

	public static void main(String[] args) {
		SupersoincAirplane sa = new SupersoincAirplane();
		sa.takeoff();
		sa.fly();
		sa.flymode = SupersoincAirplane.supersonic;
		sa.fly();
		sa.flymode = SupersoincAirplane.normal;
		sa.fly();
		sa.land();
		
		
	}/////main
}////////class
