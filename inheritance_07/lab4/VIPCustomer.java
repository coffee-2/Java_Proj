package inheritance_07.lab4;

public class VIPCustomer extends Customer{
	private int agentID; //VIP 고객은 담당 사원이 특별 관리
	double sr; //할인율
	
	public VIPCustomer() {
		grade = "VIP";
		br = 0.05;
		sr = 0.1;}
	
	public VIPCustomer(int ID, String name, int agentID) {
		super(ID, name); //super : 부모 클래스의 생성자 호출
		grade = "VIP";
		br = 0.05;
		sr = 0.1;
		this.agentID = agentID;}
	
	public int calprice(int price) {
		bp += price*br;					  //보너스 포인트 적립
		return price - (int)(price*sr);}  //물품 가격 할인
	
	public int getAgent() {return agentID;}
	
	
}//////class
