package exception_10.p431_p442;

public class ThrowsEx {
		
public static void findClass() throws ClassNotFoundException {
	Class cla = Class.forName("java.lang.String1");}
		
	public static void main(String[] args) {
		try {findClass();} 
		catch (ClassNotFoundException e) {
			System.out.println("Class doesn't exist");
			System.out.println(e);}
		
		
	}///main
}/////class
