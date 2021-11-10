package generic_12;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> po = new GenericPrinter<Powder>();
		po.setMaterial(new Powder());
		
		Powder powder = po.getMaterial();
		System.out.println(po);
		System.out.println(powder);
		
		System.out.println("======================");
		
		GenericPrinter<Plastic> pl = new GenericPrinter<Plastic>();
		pl.setMaterial(new Plastic());
		
		Plastic plastic = pl.getMaterial();
		System.out.println(pl);
		System.out.println(plastic);
		
		System.out.println("======================");
		
		GenericPrinter<Water> wa = new GenericPrinter<Water>();
		wa.setMaterial(new Water());
		
		Water water = wa.getMaterial();
		System.out.println(wa);
		System.out.println(water);
		
		
		
	}/////main
}//////class
