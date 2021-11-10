package inheritance_07.lab13_p314_p317;

public class Car {
	Tire fL = new Tire("앞왼쪽", 5);	
	Tire fR = new Tire("앞오른쪽", 8);
	Tire bL = new Tire("뒤왼쪽", 10);
	Tire bR = new Tire("뒤오른쪽", 9);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(fL.roll()==false) {stop(); return 1;}
		if(fR.roll()==false) {stop(); return 2;}
		if(bL.roll()==false) {stop(); return 3;}
		if(bR.roll()==false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {System.out.println("[자동차가 멈춥니다.]");}
	
}
