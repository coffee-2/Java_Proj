package inheritance_07.lab13_p314_p317;

public class Tire {
	public int maxRo;
	public int accRo;
	public String location;
	
	public Tire(String location, int maxRo) {
		this.location = location;  this.maxRo = maxRo;}
	
	public boolean roll() {
		++accRo;
		if(accRo<maxRo) {System.out.println(location+" 타이어 수명 : "+(maxRo-accRo)+"회");
			return true;}
		else {System.out.println("*** "+location+" 타이어 펑크 ***");
			  return false;}
	}
	
}
