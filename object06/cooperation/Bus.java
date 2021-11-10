package object06.cooperation;

public class Bus {
	 public int busNum; //버스번호
	 public int passengerCount; //승객수
	 public int money; //수입
	
	public Bus (int busNum) {
		this.busNum = busNum;}
	
	public void take (int money) {
		this.money += money; ///this.money = this.money + money
							 ///기존의 버스 수입에서 money를 추가해 다시 메모리에 저장
		passengerCount++;}   ///승객 수를 증가
	
	public void showInfo () {
		System.out.println("버스 " + busNum + "번의 승객은 " + 
				passengerCount + "명이고, 수입은 " + money + "원 입니다.");}
	
	
	
}/////class