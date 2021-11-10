package interface_08.lab06_p349_p354;

public class RemotControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setVol(70);
		rc.setMute(true);
		rc.setMute(false);
		rc.setVol(50);
		rc.turnOff();
		
		System.out.println("=====================");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVol(60);
		rc.setMute(true);
		rc.setMute(false);
		rc.setVol(80);
		rc.turnOff();
		
		
	}///main
}////class
