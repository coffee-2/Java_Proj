package exception_10;

public class Ex_p424 {

	public static void main(String[] args) {
		
		try {
		String data1 = args[0];
		String data2 = args[1];
			
		System.out.println("args[0] : "+data1);
		System.out.println("args[1] : "+data2);}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("catch �۵�");}
		
		System.out.println("���α׷� ����");
		
		
	}///main
}///////class
