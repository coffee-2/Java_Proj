package inheritance_07.lab4;

public class VIPCustomer extends Customer{
	private int agentID; //VIP ���� ��� ����� Ư�� ����
	double sr; //������
	
	public VIPCustomer() {
		grade = "VIP";
		br = 0.05;
		sr = 0.1;}
	
	public VIPCustomer(int ID, String name, int agentID) {
		super(ID, name); //super : �θ� Ŭ������ ������ ȣ��
		grade = "VIP";
		br = 0.05;
		sr = 0.1;
		this.agentID = agentID;}
	
	public int calprice(int price) {
		bp += price*br;					  //���ʽ� ����Ʈ ����
		return price - (int)(price*sr);}  //��ǰ ���� ����
	
	public int getAgent() {return agentID;}
	
	
}//////class
