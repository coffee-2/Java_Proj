package inheritance_07.lab13_p314_p317;

public class Tire {
	public int maxRo;
	public int accRo;
	public String location;
	
	public Tire(String location, int maxRo) {
		this.location = location;  this.maxRo = maxRo;}
	
	public boolean roll() {
		++accRo;
		if(accRo<maxRo) {System.out.println(location+" Ÿ�̾� ���� : "+(maxRo-accRo)+"ȸ");
			return true;}
		else {System.out.println("*** "+location+" Ÿ�̾� ��ũ ***");
			  return false;}
	}
	
}
