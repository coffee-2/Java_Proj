package inheritance_07.lab13_p314_p317;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRo) {
		super(location, maxRo);}
	
	@Override
	public boolean roll() {
		++accRo;
		if(accRo<maxRo) {System.out.println(location+" HankookTire ���� : "
				+(maxRo-accRo)+"ȸ");  return true;}
		else {System.out.println("*** "+location+" HankookTire ��ũ ***");
			  return false;}
	}
	
}
