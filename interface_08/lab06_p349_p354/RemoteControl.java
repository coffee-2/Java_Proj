package interface_08.lab06_p349_p354;

public interface RemoteControl {
	int maxvol = 100;
	int minvol = 0;
	
	void turnOn();
	void turnOff();
	void setVol(int vol);
	
	default void setMute(boolean mute) {
		if(mute) {System.out.println("���Ұ� �մϴ�.");}
		else {System.out.println("���ҰŸ� ���� �մϴ�.");}
	}
	
	static void changeB() {System.out.println("���͸��� ��ȯ�մϴ�.");}
	
	
}
