package inheritance_07.lab1_p290;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {System.out.println("ä�� " + channel + "���� ����� �մϴ�.");}
	void turnOffDmb() {System.out.println("Dmb ����� ���ϴ�.");}
	void change(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");}
	
}////////class
