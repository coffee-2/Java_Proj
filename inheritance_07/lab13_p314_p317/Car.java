package inheritance_07.lab13_p314_p317;

public class Car {
	Tire fL = new Tire("�տ���", 5);	
	Tire fR = new Tire("�տ�����", 8);
	Tire bL = new Tire("�ڿ���", 10);
	Tire bR = new Tire("�ڿ�����", 9);
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(fL.roll()==false) {stop(); return 1;}
		if(fR.roll()==false) {stop(); return 2;}
		if(bL.roll()==false) {stop(); return 3;}
		if(bR.roll()==false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {System.out.println("[�ڵ����� ����ϴ�.]");}
	
}
