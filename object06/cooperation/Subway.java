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
		System.out.println(subNum + "의 승객은 " + passengerCount 
				+ "명이고, 수입은 " + money + "원 입니다.");}



}//////class