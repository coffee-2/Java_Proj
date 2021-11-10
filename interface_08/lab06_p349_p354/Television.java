package interface_08.lab06_p349_p354;

public class Television implements RemoteControl{

	private int vol;
	
	@Override
	public void turnOn() {System.out.println("TV�� �մϴ�.");}

	@Override
	public void turnOff() {System.out.println("TV�� ���ϴ�.");}

	@Override
	public void setVol(int vol) {
		if(vol>RemoteControl.maxvol) {this.vol = RemoteControl.maxvol;}
		else if(vol<RemoteControl.minvol) {this.vol = RemoteControl.minvol;}
		else {this.vol = vol;}
		
		System.out.println("���� TV ���� : "+vol);
	}
	
	
}
