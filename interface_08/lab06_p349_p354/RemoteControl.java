package interface_08.lab06_p349_p354;

public interface RemoteControl {
	int maxvol = 100;
	int minvol = 0;
	
	void turnOn();
	void turnOff();
	void setVol(int vol);
	
	default void setMute(boolean mute) {
		if(mute) {System.out.println("음소거 합니다.");}
		else {System.out.println("음소거를 해제 합니다.");}
	}
	
	static void changeB() {System.out.println("배터리를 교환합니다.");}
	
	
}
