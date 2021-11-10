package inheritance_07.lab4.arraylist;

public class GoldCustomer extends Customer{
	double sr;
	
	public GoldCustomer() {grade = "Gold";  br = 0.03;  sr = 0.05;}
	
	public GoldCustomer(int ID, String name) {
		super (ID, name);
		grade = "Gold";
		br = 0.03;  sr = 0.05;}
	
	@Override
	public int calprice(int price) {
		bp += price*br;
		return price - (int)(price*sr);}
	
	
	
	
	
	
	
}
