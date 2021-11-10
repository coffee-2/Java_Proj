package generic_12.restrict;

public class GenericPrinterEx {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> po = new GenericPrinter<Powder>();
		po.setMaterial(new Powder());
		
		Powder powder = po.getMaterial();
		System.out.println(po);
		System.out.println(powder);
		powder.doPrint();
		
		
		System.out.println("===========================");
		
		GenericPrinter<Plastic> pl = new GenericPrinter<Plastic>();
		pl.setMaterial(new Plastic());
		
		Plastic plastic = pl.getMaterial();
		System.out.println(pl);
		System.out.println(plastic);
		plastic.doPrint();
		
		System.out.println("===========================");
		
		//GenericPrinter<Water> wa = new GenericPrinter<Water>();
		//extends Material �� ���� �ʾұ� ������ ������ ��(���� �� ����)
		
		Water water = new Water();
		System.out.println(water);
		water.doPrint();
		
		
		
	}/////main
}//////class
