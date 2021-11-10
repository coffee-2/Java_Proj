package lamda_14.lamda.lab02;

public class ArithmeticOperationComp implements ArithmeticOperation{

	@Override
	public void ArithmethicOper(int x, int y) {
		System.out.println("x + y = "+(x+y));
		System.out.println("x - y = "+(x-y));
		System.out.println("x * y = "+(x*y));
		System.out.println("x / y = "+(x/y));
	}

}
