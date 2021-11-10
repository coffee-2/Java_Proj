package inheritance_07.lab14_p322_p337.parent;

public class ChildEx {

	public static void main(String[] args) {
		Parent p = new Child();
		p.field1 = "필드1";
		p.method1();
		p.method2();
		
		Child c = (Child)p;
		c.field2 = "필드2";
		c.method3();
		
	}//////main
}/////////class
