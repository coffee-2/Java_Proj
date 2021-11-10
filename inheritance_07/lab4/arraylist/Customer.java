package inheritance_07.lab4.arraylist;

public class Customer {
	protected int ID;
	protected String name;
	protected String grade;   //(VIP, Gold, Silver)
	int bp;				 	//보너스 포인트(고객 등급에 따라 차등)
	double br;				//포인트 적립 비율(고객 등급에 따라 차등)
	
	public Customer() {
		initCustomer();}  
	
	public Customer(int ID, String name) {
		this.ID = ID;
		this.name = name;
		initCustomer();}
	
	private void initCustomer() { //고객등급을 초기화 하는 메소드
		grade = "Silver";		//기본 회원의 등급 : Silver, 1%
		br = 0.01;}
	
	
	public int calprice(int price) { //메소드 오버라이딩 : 상솟 관계에서 부모클래스의 메소드를
									                 //재정의해서 사용
		bp += price*br;				//구매한 물품에 대해서 보너스 포인트 적립
		return price;}
	
	public String showInfo() {
		return name + " 님의 등급은 " + grade + " 등급 이며 보너스 포인트는 " 
				+ bp + "점 입니다.";}
	
	// ID, name, grade 의 Getter & Setter
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getGrade() {return grade;}
	public void setGrade(String grade) {this.grade = grade;}
	
}//////class
