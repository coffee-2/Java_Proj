package object06.cooperation;

public class Bus {
	 public int busNum; //������ȣ
	 public int passengerCount; //�°���
	 public int money; //����
	
	public Bus (int busNum) {
		this.busNum = busNum;}
	
	public void take (int money) {
		this.money += money; ///this.money = this.money + money
							 ///������ ���� ���Կ��� money�� �߰��� �ٽ� �޸𸮿� ����
		passengerCount++;}   ///�°� ���� ����
	
	public void showInfo () {
		System.out.println("���� " + busNum + "���� �°��� " + 
				passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");}
	
	
	
}/////class