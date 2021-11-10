package interface_08.lab06_p349_p354;

public class Audio implements RemoteControl{
	private int vol;

	@Override
	public void turnOn() {System.out.println("Audio�� �մϴ�.");}

	@Override
	public void turnOff() {System.out.println("Audio�� ���ϴ�.");}
	
	@Override
	public void setVol(int vol) {
		if(vol>RemoteControl.maxvol) {this.vol = RemoteControl.maxvol;}
		else if(vol<RemoteControl.minvol) {this.vol = RemoteControl.minvol;}
		else {this.vol = vol;}
		
		System.out.println("���� Audio ���� : "+vol);
	}
	
	
}
