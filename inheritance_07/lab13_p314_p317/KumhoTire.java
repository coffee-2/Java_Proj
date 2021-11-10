package inheritance_07.lab13_p314_p317;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRo) {
		super(location, maxRo);}
		
	@Override
	public boolean roll() {
		++accRo;
		if(accRo<maxRo) {System.out.println(location+" KumhoTire ¼ö¸í : "
				+(maxRo-accRo)+"È¸"); return true;}
		else {System.out.println("*** "+location+" KumhoTire ÆãÅ© ***");  
			 return false;}
	}
		
}
