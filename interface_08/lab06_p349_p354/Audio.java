package interface_08.lab06_p349_p354;

public class Audio implements RemoteControl{
	private int vol;

	@Override
	public void turnOn() {System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");}

	@Override
	public void turnOff() {System.out.println("Audio¸¦ ²ü´Ï´Ù.");}
	
	@Override
	public void setVol(int vol) {
		if(vol>RemoteControl.maxvol) {this.vol = RemoteControl.maxvol;}
		else if(vol<RemoteControl.minvol) {this.vol = RemoteControl.minvol;}
		else {this.vol = vol;}
		
		System.out.println("ÇöÀç Audio º¼·ý : "+vol);
	}
	
	
}
