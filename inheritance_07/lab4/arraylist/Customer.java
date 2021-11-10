package inheritance_07.lab4.arraylist;

public class Customer {
	protected int ID;
	protected String name;
	protected String grade;   //(VIP, Gold, Silver)
	int bp;				 	//���ʽ� ����Ʈ(�� ��޿� ���� ����)
	double br;				//����Ʈ ���� ����(�� ��޿� ���� ����)
	
	public Customer() {
		initCustomer();}  
	
	public Customer(int ID, String name) {
		this.ID = ID;
		this.name = name;
		initCustomer();}
	
	private void initCustomer() { //������� �ʱ�ȭ �ϴ� �޼ҵ�
		grade = "Silver";		//�⺻ ȸ���� ��� : Silver, 1%
		br = 0.01;}
	
	
	public int calprice(int price) { //�޼ҵ� �������̵� : ��� ���迡�� �θ�Ŭ������ �޼ҵ带
									                 //�������ؼ� ���
		bp += price*br;				//������ ��ǰ�� ���ؼ� ���ʽ� ����Ʈ ����
		return price;}
	
	public String showInfo() {
		return name + " ���� ����� " + grade + " ��� �̸� ���ʽ� ����Ʈ�� " 
				+ bp + "�� �Դϴ�.";}
	
	// ID, name, grade �� Getter & Setter
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getGrade() {return grade;}
	public void setGrade(String grade) {this.grade = grade;}
	
}//////class
