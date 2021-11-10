package inheritance_07.lab1_p290;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {System.out.println("채널 " + channel + "번의 방송을 켭니다.");}
	void turnOffDmb() {System.out.println("Dmb 방송을 끕니다.");}
	void change(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");}
	
}////////class
