package object06.cooperation;

public class Subway {
	public String subNum;
	public int passengerCount;
	public int money;

	public Subway (String subNum) {
		this.subNum = subNum;}

	public void take (int money) {
		this.money +=money;
		passengerCount++;}

	public void showInfo() {
		System.out.println(subNum + "�� �°��� " + passengerCount 
				+ "���̰�, ������ " + money + "�� �Դϴ�.");}



}//////class