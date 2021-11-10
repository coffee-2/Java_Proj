package ex.lamda;

public class Calcex implements Calc {

	double x,y;
	public void doClac(double x, double y) {
		this.x = x;
		this.y = y;
		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println(x+"-"+y+"="+(x-y));
		System.out.println(x+"*"+y+"="+(x*y));
		try {System.out.println(x+"/"+y+"="+(double)(x/y));}
		catch(ArithmeticException e) {
			System.out.println(e+"\r\n0으로 나눌 수 없습니다.");}
	}
}
